package app;

import java.text.DecimalFormat;

public class Test12 {
    public static void main(String[] args) {

        double a = 3.45;
        double incertezaA = 0.03;
        double b = 10.47;
        double incertezaB = 0.01;
        double c = 5.342;
        double incertezaC = 0.005;

        double A = b / c;

        double termo1 = Math.pow((incertezaB / b), 2);
        double termo2 = Math.pow((incertezaC / c), 2);
        double incertezaEmA = A * Math.sqrt(termo1 + termo2 + Math.pow((incertezaA / a), 2));

        DecimalFormat dfValor = new DecimalFormat("#.#####");
        DecimalFormat dfIncerteza = new DecimalFormat("#.#####");

        System.out.println("Resultado (A): " + dfValor.format(A));
        System.out.println("Incerteza em A: " + dfIncerteza.format(incertezaEmA));
        
    }
}
