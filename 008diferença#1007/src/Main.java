import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int A,B,C,D, DIFERENCA;
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(novo);

        A = Integer.parseInt(bfr.readLine());
        B = Integer.parseInt(bfr.readLine());
        C = Integer.parseInt(bfr.readLine());
        D = Integer.parseInt(bfr.readLine());
        DIFERENCA =(A*B - C*D);

        System.out.printf("DIFERENCA = %d\n", DIFERENCA);
    }
}
