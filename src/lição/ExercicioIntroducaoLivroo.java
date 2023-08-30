package lição;

import java.util.Scanner;

public class ExercicioIntroducaoLivroo {
    public static void main(String [] args) { 
        Scanner entrada = new Scanner(System.in);
        double cotaçao_dolar, valor_dolar, valor_real;

        System.out.print("Conversor de dólar em real \n\n");

        System.out.print("Digite a cotação do dólar: ");
        cotaçao_dolar = entrada.nextDouble(); 

        System.out.print("Digite o valor em dólar:");
        valor_dolar = entrada.nextDouble();

        valor_real = cotaçao_dolar * valor_dolar;

        System.out.print("O valor em reais é " + valor_real + "\n");

        entrada.close();

    }
    
}
