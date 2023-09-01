package matrizes;

public class licao2 {
    public static void main(String [] args) {
        int[][] matriz = new int[2][2];
         // Modificar os elementos nas posições especificadas
        matriz[1][1] = 10; // Elemento na posição (1, 1)
        matriz[1][0] = 20; // Elemento na posição (1, 0)
        matriz[0][1] = 30; // Elemento na posição (0, 1)
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Elemento na posição (" + i + ", " + j + "): " + matriz[i][j]);
                    }
                }
            }
     
        
    }
    

