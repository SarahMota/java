package matriz;

public class licao1 {
    public static void main(String [] args) {
        int[][] matriz = {
            {3, 5, 7},
            {1, 7, 4},
            {6, 3, 8}
        };

       
        int elemento22 = matriz[0][0]; 
        int elemento21 = matriz[1][1]; 
        int elemento12 = matriz[0][2]; 

       
        System.out.println("Elemento na segunda linha e segunda coluna: " + elemento22);
        System.out.println("Elemento na segunda linha e primeira coluna: " + elemento21);
        System.out.println("Elemento na primeira linha e segunda coluna: " + elemento12);
    }
}
