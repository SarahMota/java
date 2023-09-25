package fila_pilha;

 import java.util.Stack;

public class exercicio3 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0)
            pilha.push(i);
        }
        for (int i = 0; i < 100; i++){
            pilha.push(2);
            pilha.pop();
            System.out.println(pilha);
            
        }
    }
    
}
