package app;

import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();
        switch(dia) {
            case 7: System.out.println("Sábado"); break;
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            default: System.out.println("Não conhecido");
  
        }    
  
    }
            
}
