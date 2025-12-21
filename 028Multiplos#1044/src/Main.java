import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int multiplo;
        if(A > B){
            multiplo = A % B;
            if(multiplo == 0){
                System.out.println("Sao Multiplos");
            }
            else{
                System.out.println("Nao sao Multiplos");
            }
        }
        else{
            multiplo = B % A;
            if(multiplo == 0){
                System.out.println("Sao Multiplos");
            }
            else{
                System.out.println("Nao sao Multiplos");
            }
        }
        scan.close();
    }
}
