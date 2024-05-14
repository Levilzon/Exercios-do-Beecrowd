import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) throws IOException{
        int primeiroValor, segundoValor, PROD;
       InputStreamReader novo = new InputStreamReader(System.in);
       BufferedReader bfr = new BufferedReader(novo);

       primeiroValor = Integer.parseInt(bfr.readLine());
       segundoValor = Integer.parseInt(bfr.readLine());
       PROD = primeiroValor*segundoValor;

       System.out.printf("PROD = %d\n", PROD);
    }
}