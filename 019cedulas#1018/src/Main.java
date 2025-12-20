import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        int N = Integer.parseInt(buffer.readLine());
        int[] valores = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidade = new int[valores.length];
        System.out.printf("%d\n", N);
        for(int i = 0; i< valores.length; i++){
            quantidade[i] = N/ valores[i];
            N %= valores[i];
        }
        for(int i = 0; i < valores.length; i++){
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidade[i], valores[i]);
        }
    }
}
