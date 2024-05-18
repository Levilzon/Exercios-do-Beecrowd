import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
    public static final double COMISSAO = 0.15;
    public static void main(String[] args) throws IOException {
        String nomeDoVendedor;
        double salario, vendasDoMes$;
        double rendaTotal;
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(novo);

        nomeDoVendedor = bfr.readLine();
        salario = Double.parseDouble(bfr.readLine());
        vendasDoMes$ = Double.parseDouble(bfr.readLine());

        rendaTotal = salario + vendasDoMes$*COMISSAO;

        System.out.printf("TOTAL = R$ %2.2f\n", rendaTotal);
    }
}