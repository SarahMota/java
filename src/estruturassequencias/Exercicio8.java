/*Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para
o garçom. Fazer um algoritmo que leia o valor gasto com as despesas realizadas em
um restaurante e imprima o valor da gorjeta e o valor total da despesa (despesa +
gorjeta). */

package estruturassequencias;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor gasto com as despesas: ");
        double valorDespesas = scanner.nextDouble();
        double gorjeta = valorDespesas * 0.10;
        double valorTotal = valorDespesas + gorjeta;

        System.out.println("Valor da gorjeta: R$" + gorjeta);
        System.out.println("Valor total da despesa: R$" + valorTotal);
        
        scanner.close();
    }
}

