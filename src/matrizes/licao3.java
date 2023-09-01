package matrizes;

public class licao3 {
    public static void main(String [] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int soma = 0;
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
            
    }
        
}
    

