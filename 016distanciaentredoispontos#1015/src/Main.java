import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int expoente = 2;
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] p1 = buffer.readLine().split(" ");
        double x1 = Double.parseDouble(p1[0]);
        double y1 = Double.parseDouble(p1[1]);

        String[] p2 = buffer.readLine().split(" ");
        double x2 = Double.parseDouble(p2[0]);
        double y2 = Double.parseDouble(p2[1]);

        double distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        System.out.printf("%.4f\n", distancia);
    }
}