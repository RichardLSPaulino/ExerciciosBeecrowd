import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalDias = input.nextInt();

        System.out.println( totalDias / 365 + " ano(s)");
        totalDias = totalDias % 365;

        System.out.println( totalDias / 30 + " mes(es)");
        totalDias = totalDias % 30;

        System.out.println( totalDias + " dia(s)");

        input.close();

    }
}