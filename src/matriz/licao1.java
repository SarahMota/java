package matriz;

public class licao1 {
    public static void main(String [] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       
        int elemento22 = matriz[2][0]; 
        int elemento21 = matriz[1][1]; 
        int elemento12 = matriz[0][1]; 

       
        System.out.println("Elemento na segunda linha e segunda coluna: " + elemento22);
        System.out.println("Elemento na segunda linha e primeira coluna: " + elemento21);
        System.out.println("Elemento na primeira linha e segunda coluna: " + elemento12);
    }
}
