import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int X = 60;
        int Y = 90;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);


       double distancia = Integer.parseInt(buffer.readLine());

        double tempo = 60*(distancia/(Y-X));

        System.out.printf("%.0f minutos\n",tempo);
    }
}