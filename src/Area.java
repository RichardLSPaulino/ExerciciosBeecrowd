import java.util.Locale;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double PI = 3.14159;

        //a) a área do triângulo retângulo que tem A por base e C por altura.
        double triangulo = (A * C) / 2;

        //b) a área do círculo de raio C. (pi = 3.14159)
        double circulo = PI * Math.pow(C, 2);

        //c) a área do trapézio que tem A e B por bases e C por altura.
        double trapezio = ((A + B) * C) / 2;

        //d) a área do quadrado que tem lado B.
        double quadrado = Math.pow(B, 2);

        //e) a área do retângulo que tem lados A e B.
        double retangulo = (A * B);

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        input.close();
    }
}
