import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        int x = Integer.parseInt(buffer.readLine());
        double y = Double.parseDouble(buffer.readLine());

        double consumoMedio = x/y;
        System.out.printf("%2.3f km/l\n",consumoMedio);
    }
}