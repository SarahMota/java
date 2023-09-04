 /*Escrever um programa para ler um número inteiro e exibir seu sucessor e seu
antecessor*/

package estruturassequencias;

import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);

        scanner.close();
    }
}

    

