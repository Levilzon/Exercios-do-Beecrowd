import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        String[] valores = buffer.readLine().split(" ");
        int A = Integer.parseInt(valores[0]);
        int B = Integer.parseInt(valores[1]);
        int C = Integer.parseInt(valores[2]);
        int D = Integer.parseInt(valores[3]);
        if(B > C && D > A){
            if(C+D > A+B){
                if(C > 0  && D > 0){
                    if(A%2 == 0){
                        System.out.println("Valores aceitos");
                    }
                   else{ System.out.println("Valores nao aceitos");
                   }
                }
                else{
                    System.out.println("Valores nao aceitos");
                }
            }
            else{
                System.out.println("Valores nao aceitos");
            }
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}