
import java.util.Scanner;

public class AvaliacaoAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];

        // Lendo as quatro notas do aluno
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Calculando a média
        double media = calcularMedia(notas);

        // Avaliando o desempenho do aluno
        avaliarDesempenho(media);
    }

    // Método para calcular a média
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para avaliar o desempenho do aluno
    public static void avaliarDesempenho(double media) {
        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else if (media >= 5 && media < 7) {
            System.out.println("ALUNO DE RECUPERAÇÃO");
        } else {
            System.out.println("ALUNO REPROVADO");
        }
    }
}
