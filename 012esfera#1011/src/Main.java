import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final double PI = 3.14159;
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        double R = Double.parseDouble(buffer.readLine());
        double volume = (4.0/3) * PI * Math.pow(R,3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}