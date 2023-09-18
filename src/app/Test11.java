package app;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de três algarismos: ");
        int numero = scanner.nextInt();
        
        if (numero >= 100 && numero <= 999) {
            int terceiroDigito = numero % 10;           
            int segundoDigito = (numero / 10) % 10;      
            int primeiroDigito = numero / 100;          
            
            int numeroInvertido = (terceiroDigito * 100) + (segundoDigito * 10) + primeiroDigito;
            
            System.out.println("Número invertido: " + numeroInvertido);
        } else {
            System.out.println("O número deve ter três algarismos.");
        }
        
        scanner.close();
    }
}

    

