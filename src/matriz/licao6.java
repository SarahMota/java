package matriz;

public class licao6 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
       
        int tamanho = matriz.length;

        System.out.println("Diagonal Inversa:"); for (int i = tamanho - 1; i >= 0; i--) {
        System.out.print(matriz[i][tamanho - 1 - i] + " ");
    }
} 

}
    
    
    




