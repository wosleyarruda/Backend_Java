
import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        
        // Lendo as quatro notas
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Calculando a média
        double media = calcularMedia(notas);

        // Exibindo o resultado
        exibirMedia(media);
    }

    // Método para calcular a média
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para exibir a média
    public static void exibirMedia(double media) {
        System.out.println("A média das notas é: " + media);
    }
}

