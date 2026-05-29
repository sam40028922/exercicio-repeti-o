import java.util.Scanner;

public class PraticaRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();


        System.out.println("\n--- Contagem Crescente ---");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("\n--- Contagem Decrescente ---");
        int contador = n;
        while (contador >= 0) {
            System.out.print(contador + " ");
            int i = contador--;
        }
        System.out.println();


        System.out.println("\n--- Exibição do Nome ---");

        // O método .length() conta a quantidade de caracteres da String
        if (nome.length() > 6) {
            System.out.println("Seu nome tem mais de 6 letras! Exibindo " + n + " vezes:");

            for (int i = 1; i <= n; i++) {
                System.out.println(i + " - " + nome);
            }
        } else {
            System.out.println("Seu nome tem 6 letras ou menos. Exibindo apenas 1 vez:");
            System.out.println(nome);
        }


        scanner.close();
    }
}