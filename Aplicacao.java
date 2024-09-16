import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[20];
        Scanner sc = new Scanner(System.in); // Cria uma única instância de Scanner

        for (int i = 0; i < 10; i++) {
            veiculos[i] = new Aviao();
            veiculos[i].entrada(sc); // Passa o Scanner como argumento
        }

        for (int i = 10; i < 20; i++) {
            veiculos[i] = new Navio();
            veiculos[i].entrada(sc); // Passa o Scanner como argumento
        }

        for (Veiculo v : veiculos) {
            v.imprimir();
            System.out.println("-------------------------");
        }

        sc.close(); // Fecha o Scanner ao final
    }
}
