import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        double n = 3.14159;
        double raio = Double.parseDouble(buffer.readLine());
        double area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
    }
}