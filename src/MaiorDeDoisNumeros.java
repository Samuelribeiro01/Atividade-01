    import java.util.Scanner;

    public class MaiorDeDoisNumeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Maior de Dois Números===");

            System.out.print("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            if (n1 > n2) {
                System.out.println("O maior número é: " + n1);
            } else if (n2 > n1) {
                System.out.println("O maior número é: " + n2);
            } else {
                System.out.println("Os números são iguais: " + n1);
            }

            scanner.close();
        }
    }
