/* Escrever um programa para ler dois números inteiros e exibi-los */


package app.estruturassequenciais;

import java.util.Scanner;

public class exercício2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;

        System.out.print("A :");
        a=entrada.nextInt();

        System.out.print("B :");
        b=entrada.nextInt();
        if(a>b)
    {     

        System.out.println("A é a maior com valor: "+a);
    }else if(b>a)  
    {
        System.out.println("B é maior com valor:"+b);
    }else
    {
        System.out.println("Os números são iguais com valor:"+a);
    }

    entrada.close();
 
    }

}    