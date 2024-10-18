import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] escolhaQuantidade = buffer.readLine().split(" ");
        int pedido = Integer.parseInt(escolhaQuantidade[0]);
        int quantidade = Integer.parseInt(escolhaQuantidade[1]);
        double[] preco = {4.00, 4.50, 5.00, 2.00, 1.50};

        if (pedido == 1) {
            double total = quantidade * preco[0];
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (pedido == 2) {
            double total = quantidade * preco[1];
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (pedido == 3) {
            double total = quantidade * preco[2];
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (pedido == 4) {
            double total = quantidade * preco[3];
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else {
            double total = quantidade * preco[4];
            System.out.printf("Total: R$ %.2f\n", total);
        }

    }
}