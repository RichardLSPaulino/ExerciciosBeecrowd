import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salario = input.nextDouble();
        double totalVendas = input.nextDouble();

        double totalDeComissao = salario + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", totalDeComissao);

    }
}
