    import java.util.Scanner;

    public class ClassificacaoIdade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Classificação de Idade ===");

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            String classificacao;

            if (idade < 0) {
                classificacao = "Idade inválida.";
            } else if (idade <= 12) {
                classificacao = "Você é Criança.";
            } else if (idade <= 17) {
                classificacao = "Você é adolescente.";
            } else if (idade <= 59) {
                classificacao = "Você é adulto";
            } else {
                classificacao = "Você é idoso.";
            }

            System.out.println("Classificação: " + classificacao);

            scanner.close();
        }
    }