package app;

import java.text.DecimalFormat;

public class Test12 {
    public static void main(String[] args) {
        // Valores e incertezas
        double a = 3.45;
        double incertezaA = 0.03;
        double b = 10.47;
        double incertezaB = 0.01;
        double c = 5.342;
        double incertezaC = 0.005;

        // Cálculo de A = B/C
        double A = b / c;

        // Cálculo da incerteza em A usando a propagação de incerteza
        double incertezaEmA = A * Math.sqrt(Math.pow((incertezaB / b), 2) + Math.pow((incertezaC / c), 2));

        // Formatação dos resultados
        DecimalFormat dfValor = new DecimalFormat("#.#####");
        DecimalFormat dfIncerteza = new DecimalFormat("#.#####");

        // Impressão dos resultados
        System.out.println("Resultado (A): " + dfValor.format(A));
        System.out.println("Incerteza em A: " + dfIncerteza.format(incertezaEmA));
    }
}
