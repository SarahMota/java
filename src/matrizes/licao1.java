package matrizes;

public class licao1 {
    public static void main(String [] args) {
        int[][] matriz = {
            {3, 7},
            {1, 4},
            {6, 8}
        };

       
        int elemento22 = matriz[1][1]; 
        int elemento21 = matriz[1][0]; 
        int elemento12 = matriz[0][1]; 

       
        System.out.println("Elemento na segunda linha e segunda coluna: " + elemento22);
        System.out.println("Elemento na segunda linha e primeira coluna: " + elemento21);
        System.out.println("Elemento na primeira linha e segunda coluna: " + elemento12);
    }
}
