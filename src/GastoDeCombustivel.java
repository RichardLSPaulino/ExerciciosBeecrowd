import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int tempoHoras = input.nextInt();
        int velocidadeMedia = input.nextInt();

        int kmRodado =  tempoHoras * velocidadeMedia;
        double kmGastos = kmRodado / 12.0;

        System.out.printf("%.3f\n", kmGastos);

        input.close();

    }
}
