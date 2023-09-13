package matriz;

public class licao7 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
       

        int tamanho = matriz.length;

        System.out.println("Diagonal Inversa:");
         for (int i = 0; i < tamanho; i++) {
        System.out.print(matriz[i][i] + " ");
    }
}

    
}
