/*Escrever um programa para ler dois números inteiros e exibir as diferenças entre eles.
Exemplo: 4 – 2 = 2 */

package estruturassequencias;

public class Exercicio5 {
    static int x = 4, y = 2;
        public static int sub(int x, int y) {
            return x - y;

}
public static void main(String[] args) {
    System.out.println(x + ", " + y);
    System.out.println("sub = " + sub(x, y));

}

}
