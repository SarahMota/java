package array;

public class Exercicio1 {
        public static void main(String[] args) {
            int i, aux;
            int v[] = new int[20];
    
            for (i = 0; i < 20; i++)
                v[i] = i + 20;
    
            System.out.println();
            System.out.println("Vetor inicial");
            for (i = 0; i < 20; i++) {
                System.out.print(v[i]);
                System.out.print(" ");
            }
                
            for (i = 0; i < 19; i++) {
                aux = v[i];
                v[i] = v[i + 1];
                v[i+1] = aux;
            }
            System.out.println();
            System.out.println("Vetor com conteúdo trocado");
            for (i=0; i<20; i++) {
                System.out.print(v[i]);
                System.out.print(" ");
            }
    
        }
    }
    

