import java.util.Locale;
import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);
    }

}
