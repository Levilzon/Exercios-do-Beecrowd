import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] array = new String[2];
        array = buffer.readLine().split(" ");

        int a, b, c;
        a = Integer.parseInt(array[0]);
        b = Integer.parseInt(array[1]);
        c = Integer.parseInt(array[2]);

        int maiorAB = (a+b+Math.abs(a-b))/2;

        int maiorComC = (maiorAB + c+Math.abs(maiorAB-c))/2;
        System.out.printf("%d eh o maior\n",  maiorComC);
    }
}