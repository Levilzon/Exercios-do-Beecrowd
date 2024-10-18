import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        DecimalFormat df = new DecimalFormat("#.#");

        String[] notas = buffer.readLine().split(" ");
        double a = Double.parseDouble(notas[0]);
        double b = Double.parseDouble(notas[1]);
        double c = Double.parseDouble(notas[2]);
        double d = Double.parseDouble(notas[3]);

        double media = (a*2 + b*3 + c*4 + d*1)/10;

        if(media < 5){
            System.out.println("Media: "+ df.format(media));
            System.out.println("Aluno reprovado.");

        }
        else if(media > 5 && media < 7){

            double exame = Double.parseDouble(buffer.readLine());
            double mediaFinal = (media+exame)/2;

            if(mediaFinal < 5){
                System.out.println("Aluno reprovado.");
            }
            else{
                System.out.println("Media: "+ df.format(media));
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", exame);
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+ df.format(mediaFinal));
            }
        }
        else{
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
    }
}