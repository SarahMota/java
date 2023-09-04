package estruturassequencias;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário da pessoa: ");
        double salarioPessoa = scanner.nextDouble();

        double salariosMinimosGanhos = salarioPessoa / salarioMinimo;

        System.out.println("A pessoa ganha " + salariosMinimosGanhos + " salários mínimos.");

        scanner.close();
    }
}
