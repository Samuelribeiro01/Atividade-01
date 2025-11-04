    import java.util.Scanner;

    public class SomaDeUmAteN {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número N: ");
            int N = scanner.nextInt();
            int soma = 0;

            // Soma de 1 até N usando laço for
            for (int i = 1; i <= N; i++) {
                soma += i;
            }

            System.out.println("A soma de 1 até " + N + "é: " + soma);

            scanner.close();
        }
    }