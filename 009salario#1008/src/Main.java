import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(novo);

        int funcionarioId, horasDeServico;
        double salario;

        funcionarioId = Integer.parseInt(bfr.readLine());
        horasDeServico = Integer.parseInt(bfr.readLine());
        salario = Double.parseDouble(bfr.readLine());
        salario *= horasDeServico;

        System.out.printf("NUMBER = %d\n", funcionarioId);
        System.out.printf("SALARY = U$ %2.2f\n", salario);
    }
}