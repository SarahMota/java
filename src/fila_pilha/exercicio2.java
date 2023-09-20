package fila_pilha;

import java.util.Stack;

public class exercicio2 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(6);
        pilha.push(7);
        pilha.push(1);
        pilha.push(8);
        pilha.push(2);

        pilha.pop(); 
        pilha.pop(); 
        pilha.push(9); 
        pilha.push(3);
        System.out.print(pilha);

 }

}
    