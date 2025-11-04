    import java.util.Scanner;

    public class TabelaMult {
        public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

            // Solicitar ao usuário o número para o qual queremos a tabuada
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt();

            // Exibir a tabuada do número de 1 a 10
            System.out.print("Tabuada de " +  numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            scanner.close();
        }
    }