package lição;

public class exercícios3 {
    public static void main(String[] args) {
        // A linha a seguir cria e inicializa um vetor de strings
        String[] frutas = {"maça", "banana", "laranja", "uva"};

        // As linhas a seguir acessam e modificam elementos 
        System.out.println("Fruta antes da modificação: " + frutas[1]);
        frutas[1] = "abacaxi"; // Modificar o segundo elemento
        System.out.println("Fruta após a modificação: " + frutas[1]);

    }

}
