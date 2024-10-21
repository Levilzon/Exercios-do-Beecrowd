import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = 4;
    public static final int D = 1;

    public static void main(String[] args) throws IOException {

        DecimalFormat df = new DecimalFormat("##.#");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String[] notas = buffer.readLine().split(" ");
        double nota1 = Double.parseDouble(notas[0]);
        double nota2 = Double.parseDouble(notas[1]);
        double nota3 = Double.parseDouble(notas[2]);
        double nota4 = Double.parseDouble(notas[3]);

        double media = (A*nota1 + B*nota2 + C*nota3 + D*nota4)/10;
        
        if(media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else if(media<7 && media >=5){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            double exame = Double.parseDouble(buffer.readLine());
            double mediaFinal = (media+exame)/2;

            if(mediaFinal >=5){
                System.out.printf("Nota do exame: %.1f\n", exame);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
            else{
                System.out.printf("Nota do exame: %.1f\n", exame);
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
                
            }   

        }
        else{
            System.out.println("Media: "+df.format(media));
            System.out.println("Aluno reprovado.");
        }
    }
}