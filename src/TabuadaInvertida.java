import java.util.Scanner;

public class TabuadaInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada invertida: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- Tabuada invertida do " + numero + " ---");

        for (int i = 10; i >= 1; i--) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
