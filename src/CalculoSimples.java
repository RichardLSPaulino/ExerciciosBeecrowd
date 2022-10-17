import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double cod1, peca1, valor1;
        double cod2, peca2, valor2;

        cod1 = input.nextInt();
        peca1 = input.nextInt();
        valor1 = input.nextDouble();

        cod2 = input.nextInt();
        peca2 = input.nextInt();
        valor2 = input.nextDouble();

        double saida1 = peca1 * valor1;
        double saida2 = peca2 * valor2;
        double total = saida1 + saida2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }

}
