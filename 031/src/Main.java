import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();

        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        int horasValor;
        int minutosValor;

        if(minutoInicial == minutoFinal && horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if(minutoInicial < minutoFinal){
            minutosValor = minutoFinal - minutoInicial;

            if(horaInicial < horaFinal){
                horasValor = horaFinal - horaInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasValor, minutosValor);
            }
            else{
                horasValor = horaFinal + 24 - horaInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasValor, minutosValor);
            }
        }  
        else{
            minutosValor = minutoFinal + 60 - minutoInicial;
            if(horaInicial > horaFinal){
                horasValor = horaFinal + 24 - horaInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasValor, minutosValor);
            }

            else{
                horasValor = horaFinal - horaInicial;
                if(minutosValor < 60){
                    horasValor -= 1;
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasValor, minutosValor);
                }
                else{
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasValor, minutosValor);
                }
            }
        }
    }
}
