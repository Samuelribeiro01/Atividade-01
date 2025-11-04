import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int tentativas = 0;

        System.out.println("🎯 Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.\n");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("🔼 O número é maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("🔽 O número é menor!");
            } else {
                System.out.println("\n🎉 Parabéns! Você acertou!");
                System.out.println("O número era: " + numeroSecreto);
                System.out.println("Tentativas: " + tentativas);
            }

        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}
