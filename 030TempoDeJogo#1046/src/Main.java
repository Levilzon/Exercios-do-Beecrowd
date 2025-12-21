import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       int horaInicial = scan.nextInt();
       int horaFinal =scan.nextInt();

       int tempo;

       if(horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
       }
       else if(horaInicial < horaFinal){
        tempo = horaFinal - horaInicial;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);
       }
        else{
            tempo = -horaInicial + (horaFinal+24);
            System.out.printf("O JOGO DUROU %d HORA(S)\n",tempo);
        }    
        scan.close();
    }
}
