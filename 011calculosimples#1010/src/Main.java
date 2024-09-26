import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Object Console;

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] pacote_1 =buffer.readLine().split(" ");

        int produto1_Id = Integer.parseInt(pacote_1[0]);
        int quantidadeProduto1 = Integer.parseInt(pacote_1[1]);
        double preco1 = Double.parseDouble((pacote_1[2]));

        String[] pacote_2 = buffer.readLine().split(" ");
        int produto2_Id = Integer.parseInt(pacote_2[0]);
        int quantidadeProduto2 = Integer.parseInt(pacote_2[1]);
        double preco2 = Double.parseDouble(pacote_2[2]);


        double somaTotal = quantidadeProduto1*preco1+quantidadeProduto2*preco2;
        System.out.printf("VALOR A PAGAR: R$ %2.2f\n", somaTotal);
    }
}