package app;

 import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int numeroDeElementos = 10;

        for (int i = 1; i <= numeroDeElementos; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / numeroDeElementos;

        System.out.println("A média aritmética dos " + numeroDeElementos + " números é: " + media);

        scanner.close();
    }
}


