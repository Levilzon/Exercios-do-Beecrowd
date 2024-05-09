import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(novo);
        int A, B, X;
        A = Integer.parseInt(bfr.readLine());
        B = Integer.parseInt(bfr.readLine());
        X = A+B;
        System.out.printf("X = %d\n", X);
    }
}