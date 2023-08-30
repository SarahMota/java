/*Digamos que uma pessoa trabalhe com importação e exportação. Certo dia, 
seu chefe pede que ela faça um programa que converta valores em dólar 
para real, uma vez que consiste em uma demanda diária do trabalho, pois 
ele precisa saber quanto ganha em real nas exportações.*/

package lição;

import java.util.Scanner;

public class exercíciointroduçãolivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxaDeConversao = 4.96;

    System.out.print("Digite o valor em dólar: ");
    double valorEmDolar = scanner.nextDouble();
    double valorEmReais = valorEmDolar * taxaDeConversao;

    System.out.println("O valor em reais é: " + valorEmReais);

    scanner.close();
    

        
    }
    
}
