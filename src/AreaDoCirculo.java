import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        double raio = input.nextDouble();
        double n = 3.14159;

        double soma = n * raio * raio;

        System.out.printf("A=%.4f\n", soma);
    }
}
