import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
public static final double PESO_UM = 2.0;
public static final double PESO_DOIS = 3.0;
public static final double PESO_TRES = 5.0;
public static final double PESO_TOTAL = PESO_UM + PESO_DOIS + PESO_TRES;
    public static void main(String[] args) throws IOException{
        double primeiraNota, segundaNota, terceiraNota, MEDIA;
        InputStreamReader novo = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(novo);

        primeiraNota = Double.parseDouble(bfr.readLine());
        segundaNota = Double.parseDouble(bfr.readLine());
        terceiraNota = Double.parseDouble(bfr.readLine());
        MEDIA = (primeiraNota*PESO_UM+segundaNota*PESO_DOIS+terceiraNota*PESO_TRES)/PESO_TOTAL;
        System.out.printf("MEDIA = %2.1f\n", MEDIA);
    }
}