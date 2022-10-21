import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();

        int min = (60 * distancia ) / 30;

        System.out.println(min + " minutos");

    }
}
