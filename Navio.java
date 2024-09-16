import java.util.Scanner;

class Navio extends Veiculo {
    private int numeroTripulantes;
    private String dataLancamento;

    public Navio() {
        super();
        this.numeroTripulantes = 0;
        this.dataLancamento = "";
    }

    public Navio(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, int numeroTripulantes, String dataLancamento) {
        super(prefixo, capacidadeTanque, numeroPassageiros, preco);
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Tripulantes: " + numeroTripulantes);
        System.out.println("Data de Lançamento: " + dataLancamento);
    }

    @Override
    public void entrada(Scanner sc) {
        super.entrada(sc); // Passar o scanner como argumento
        System.out.print("Digite o número de tripulantes: ");
        this.numeroTripulantes = Integer.parseInt(sc.nextLine()); // Consumir a linha após nextInt
        System.out.print("Digite a data de lançamento: ");
        this.dataLancamento = sc.nextLine();
    }

    public double passageirosPorTripulantes() {
        if (numeroTripulantes != 0) {
            return (double) numeroPassageiros / numeroTripulantes;
        } else {
            System.out.println("Erro: Número de tripulantes não pode ser zero.");
            return 0;
        }
    }
}
