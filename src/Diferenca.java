import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);
    }

}
