import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final double kmPorL = 12;
    public static void main(String[] args) throws IOException {
        int velocidade, tempo;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        tempo = Integer.parseInt(buffer.readLine());
        velocidade = Integer.parseInt(buffer.readLine());

        double distancia = velocidade*tempo;

        double gastoTotal = distancia/kmPorL;

        System.out.printf("%.3f\n", gastoTotal);
    }
}