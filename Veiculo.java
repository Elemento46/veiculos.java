import java.util.Scanner;

class Veiculo {
    protected String prefixo;
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    public Veiculo() {
        this.prefixo = "";
        this.capacidadeTanque = 0;
        this.numeroPassageiros = 0;
        this.preco = 0.0;
    }

    public Veiculo(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
    }

    public void entrada(Scanner sc) {
        try {
            System.out.print("Digite o prefixo: ");
            this.prefixo = sc.nextLine();
            System.out.print("Digite a capacidade do tanque: ");
            this.capacidadeTanque = Integer.parseInt(sc.nextLine()); // Consumir o newline após o número
            System.out.print("Digite o número de passageiros: ");
            this.numeroPassageiros = Integer.parseInt(sc.nextLine()); // Consumir o newline após o número
            System.out.print("Digite o preço: ");
            this.preco = Double.parseDouble(sc.nextLine()); // Consumir o newline após o número
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Tente novamente.");
        }
    }

    public void reajustarPreco(double percentual) {
        this.preco += this.preco * (percentual / 100);
    }
}
