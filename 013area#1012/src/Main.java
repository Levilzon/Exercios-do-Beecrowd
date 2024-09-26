import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static final double PI = 3.14159;
    public static void main(String[] args) throws IOException {
        double A, B, C;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] valores = buffer.readLine().split(" ");

        A = Double.parseDouble(valores[0]);
        B = Double.parseDouble(valores[1]);
        C = Double.parseDouble(valores[2]);

        double areaTrianguloRetangulo = (A*C)/2;
        double areaCirculo = PI * Math.pow(C,2);
        double areaTrapezio = ((A+B) * C)/2;
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}