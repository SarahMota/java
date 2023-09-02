package matriz;

public class licao2 {
    public static void main(String [] args) {
        int[][] matriz = new int[2][2];
        
        matriz[1][1] = 10; 
        matriz[1][0] = 20;
        matriz[0][1] = 30; 
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Elemento na posição (" + i + ", " + j + "): " + matriz[i][j]);
                    }
                }
            }
     
        
    }
    

