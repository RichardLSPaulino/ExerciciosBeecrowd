import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x = input.nextInt();
        double y = input.nextDouble();

        double totalGasto = ((x / 2f) / y )* 2;

        System.out.printf("%.3f%s\n", totalGasto, " km/l");
    }
}
