import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] valores = buffer.readLine().split(" ");
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);

        double delta = Math.pow(B,2) - 4*A*C;

        double numerador1 = -B + Math.sqrt(delta);
        double numerador2 = -B - Math.sqrt(delta);
        double raiz1 = numerador1/(2*A);
        double raiz2 = numerador2/(2*A);

        if(delta < 0){
            System.out.println("Impossivel calcular");
        }
        else if(numerador1 == 0 || numerador2 == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);
        }
    }
}