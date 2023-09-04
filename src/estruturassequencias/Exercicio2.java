/* Escrever um programa para ler dois números inteiros e exibi-los */

package estruturassequencias;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Você digitou os números: " + numero1 + " e " + numero2);

        scanner.close();
    }
}
