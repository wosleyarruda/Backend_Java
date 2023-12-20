
import java.util.Scanner;

public class ConversorPrimitivoParaWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor numérico do tipo int
        System.out.println("Digite um número inteiro:");
        int numeroPrimitivo = scanner.nextInt();

        // Convertendo o tipo primitivo para o tipo wrapper
        Integer numeroWrapper = numeroPrimitivo;

        // Imprimindo o valor na console
        System.out.println("O valor na forma de tipo wrapper é: " + numeroWrapper);
    }
}

