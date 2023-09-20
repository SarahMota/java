package fila_pilha;

import java.util.Stack;

public class exercicio1 {
     public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(2);
        pilha.push(4);
        pilha.push(3);
        pilha.push(5);

        int x = pilha.pop(); // x vale 5
        int soma = 0; 
        soma = soma + x; // soma agora vale 5
        x = 10;
        pilha.push(x); // agora o topo vale 10
        x = 12;
        pilha.push(x); // agora o topo vale 12
        x = pilha.pop(); // x = 12
        x = pilha.pop(); // x = 10
        soma = soma + x; // 10 + 15 = 15
        System.out.println("Elementos na pilha: " + soma); // Corrigido para imprimir x
    }
}

    




