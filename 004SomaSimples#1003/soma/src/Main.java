import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader brf = new BufferedReader(novo);
        int A,B,SOMA;
        A =Integer.parseInt(brf.readLine());
        B = Integer.parseInt(brf.readLine());
        SOMA = A+B;

        System.out.printf("SOMA = %d\n", SOMA);
    }
}