import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        double N = Double.parseDouble(buffer.readLine());


        if(N < 0){
            System.out.println("Fora de intervalo");
        }
        else if(N <= 25.000000 ){
            System.out.println("Intervalo [0,25]");
        }
        else if(N >= 25.00001 && N <= 50.0000000){
                System.out.println("Intervalo (25,50]");
        }
        else if(N >= 50.0000001 && N <= 75.0000000){
            System.out.println("Intervalo (50,75]");
        }
        else if(N > 75.00000001 && N <= 100){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
}