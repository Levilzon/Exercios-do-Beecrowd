import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        int N = Integer.parseInt(buffer.readLine());


        int segundos;
        int minutos;
        int horas;


        if(N < 60){
            horas = 0;
            minutos = 0;
            segundos = N;
            System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        }
        else{
             horas = 0;
             minutos = N /60;
             segundos = N % 60;
             if(minutos > 60){
                 horas = minutos / 60;
                 minutos %= 60;

                 System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
             }
             else{
                 System.out.printf("%d:%d:%d\n", horas, minutos,segundos);
             }
        }
    }
}