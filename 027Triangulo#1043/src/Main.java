import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        
        double somaAB = A + B;
        double somaAC = A + C;
        double somaBC = B + C;

        if(somaAB > C){
            if(somaAC > B){
                if (somaBC > A){
                    double perimetroTriangulo = A + B + C;
                    System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
                } 
                else{
                    double areaTrapezio = (C * (A + B))/2;
                    System.out.printf("Area = %.1f\n", areaTrapezio);
                }
            }
            else{
                double areaTrapezio = (C * (A + B))/2;
                System.out.printf("Area = %.1f\n", areaTrapezio);
            }
        }
        else{
            double areaTrapezio = (C * (A + B))/2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }
    }
}
