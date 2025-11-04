    import java.util.Scanner;

    public class TempConverter  {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Conversor de Temperatura ===");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            double temperatura, resultado;

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura * 9/5) + 32;
                    System.out.println(temperatura + "°C = " + resultado + "°F");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura - 32) * 5/9;
                    System.out.println(temperatura + "°F = " + resultado + "°C");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

            scanner.close();
        }
    }