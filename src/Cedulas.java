import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cem, cinquenta, vinte, dez, cinco, dois, um;

        int valorLido = (int)input.nextDouble();
        float valor = valorLido;

        cem = (int) (valor / 100);
        valor %= 100;

        cinquenta = (int) (valor / 50);
        valor %= 50;

        vinte = (int) (valor / 20);
        valor %= 20;

        dez = (int) (valor / 10);
        valor %= 10;

        cinco = (int) (valor / 5);
        valor %= 5;

        dois = (int) (valor / 2);
        valor %= 2;

        um = (int) (valor / 1);
        valor %= 1;

        System.out.println(valorLido);
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        System.out.printf("%d nota(s) de R$ 50,00\n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", dez);
        System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", dois);
        System.out.printf("%d nota(s) de R$ 1,00\n", um);

        input.close();
    }
}
