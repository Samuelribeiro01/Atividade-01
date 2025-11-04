import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: R$ ");
        int valor = scanner.nextInt();

        // Verificação básica
        if (valor < 5 || valor % 5 != 0) {
            System.out.println("Valor inválido! O valor deve ser múltiplo de 5 e no mínimo R$5.");
        } else {
            int notas100 = valor / 100;
            valor %= 100;

            int notas50 = valor / 50;
            valor %= 50;

            int notas20 = valor / 20;
            valor %= 20;

            int notas10 = valor / 10;
            valor %= 10;

            int notas5 = valor / 5;
            valor %= 5;

            System.out.println("\n--- Distribuição de notas ---");
            if (notas100 > 0) System.out.println("Notas de 100: " + notas100);
            if (notas50 > 0) System.out.println("Notas de 50: " + notas50);
            if (notas20 > 0) System.out.println("Notas de 20: " + notas20);
            if (notas10 > 0) System.out.println("Notas de 10: " + notas10);
            if (notas5 > 0) System.out.println("Notas de 5: " + notas5);
        }

        scanner.close();
    }
}

