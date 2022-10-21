import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Double x1, y1;
        Double x2, y2;

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        Double distancia = Math.sqrt((x2 - x1 ) * (x2 - x1 ) + (y2 - y1 ) * (y2 - y1 ));

        System.out.printf("%.4f\n", distancia);

        input.close();

    }
}
