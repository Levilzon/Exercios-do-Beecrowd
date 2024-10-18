import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        int N = Integer.parseInt(buffer.readLine());

        int ano, mes, dia;

        if(N < 30){
            ano = 0;
            mes = 0;
            dia = N;
            System.out.printf("%d ano\n%d mes\n%d dia", ano, mes, dia);
        }
        else{

        }

    }
}
