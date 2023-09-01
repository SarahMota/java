package matriz;

public class licao4 {
public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 7},
            {1, 7, 4},
            {6, 3, 8}
        };

        // Imprime os elementos da diagonal principal
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
