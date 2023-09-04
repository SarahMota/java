/*Escrever um programa para ler dois números inteiros e exibir a multiplicação entre
eles. Exemplo: 3 * 2 = 6 */

package estruturassequencias;

 import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 * numero2;

        System.out.println(numero1 + " * " + numero2 + " = " + resultado);

        scanner.close();
    }
}

