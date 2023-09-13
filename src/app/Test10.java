package app;

public class Test10 {
    public static void main(String[] args) {
        int i, j;
        int m[][] = new int[3][3];
    
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                m[i][j] = i + j;
        System.out.println();
        System.out.println("Diagonal principal:");
    
        for (i = 0; i < 3; i++) {
            System.out.print(m[i][i] + " ");
        }
    
        System.out.println(); 
    }
    
    
}

