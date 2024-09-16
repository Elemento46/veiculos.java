import java.util.Scanner;

class Aviao extends Veiculo {
    private String dataRevisao;

    public Aviao() {
        super();
        this.dataRevisao = "";
    }

    public Aviao(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao) {
        super(prefixo, capacidadeTanque, numeroPassageiros, preco);
        this.dataRevisao = dataRevisao;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Data de Revisão: " + dataRevisao);
    }

    @Override
    public void entrada(Scanner sc) {
        super.entrada(sc); // Passar o scanner como argumento
        System.out.print("Digite a data de revisão: ");
        this.dataRevisao = sc.nextLine(); // Leitura de string, não precisa limpar buffer
    }
}
