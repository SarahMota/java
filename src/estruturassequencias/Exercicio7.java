/*Escrever um programa para ler dois números inteiros e exibir o quociente e o resto
entre eles. Exemplo: 16 / 3 = 5 16 % 3 = 1 */

package estruturassequencias;

 import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int quociente = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println(numero1 + " / " + numero2 + " = " + quociente);
        System.out.println(numero1 + " % " + numero2 + " = " + resto);


        scanner.close();
    }
}

