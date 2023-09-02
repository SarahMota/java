package matriz;

public class licao5 {
    public static void main(String [] args) {
        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];
         for(int i = 0; i < tamanho; i++) {
            for(int j = 0; j < tamanho; j++) {
                matriz[i][j] = i * tamanho + j + 1;
             System.out.println("Elemento na posição (" + i + ", " + j + "): " + matriz[i][j]);
            }

        }
    }
    
}


