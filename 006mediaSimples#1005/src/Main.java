import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static final double PESOUM = 3.5;
    public static final double PESODOIS = 7.5;
    public static final double PESOTOTAL = PESOUM + PESODOIS;
    public static void main(String[] args) throws IOException {
        double primeiroValor, segundoValor, MEDIA;
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(novo);

        primeiroValor = Double.parseDouble(bfr.readLine());
        segundoValor = Double.parseDouble(bfr.readLine());
        MEDIA = (primeiroValor*PESOUM + segundoValor*PESODOIS)/PESOTOTAL;

        System.out.printf("MEDIA = %2.5f\n", MEDIA);
    }
}