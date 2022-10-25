import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, segundos, segundosTotal;

        segundosTotal = input.nextInt();

        horas = segundosTotal / 3600;
        minutos = ((segundosTotal % 3600) / 60);
        segundos = segundosTotal % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();
    }
}