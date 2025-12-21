import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if(A < B){
            double aux1 = A;
            A = B;
            B = aux1;
            if(A < C){
                double aux2 = A;
                A = C;
                C = aux2;

                double trianguloReal = B + C;
                double quadradoDaSoma = Math.pow(B, 2) + Math.pow(C, 2);

                if(A < trianguloReal && Math.pow(A,2) == quadradoDaSoma){
                    System.out.println("TRIANGULO RETANGULO");

                    if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                    else if(B == C && B == A){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }                                 
                else if(A < trianguloReal && Math.pow(A,2) > quadradoDaSoma){
                    System.out.println("TRIANGULO OBTUSANGULO");

                    if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                    else if(B == C && B == A){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }
                else if(A < trianguloReal && Math.pow(A,2) < quadradoDaSoma){
                    System.out.println("TRIANGULO ACUTANGULO");

                    if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                    else if(B == C && B == A){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }
                else{
                    System.out.println("NAO FORMA TRIANGULO");
                }
            }
            else{
                double trianguloReal = B + C;
                double quadradoDaSoma = Math.pow(B, 2) + Math.pow(C, 2);

                if(A < trianguloReal && Math.pow(A,2) == quadradoDaSoma){
                    System.out.println("TRIANGULO RETANGULO");

                    if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                    else if(B == C && B == A){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }                                 
                else if(A < trianguloReal && Math.pow(A,2) > quadradoDaSoma){
                    System.out.println("TRIANGULO OBTUSANGULO");

                    if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                    else if(B == C && B == A){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }
                else if(A < trianguloReal && Math.pow(A,2) < quadradoDaSoma){
                    System.out.println("TRIANGULO ACUTANGULO");

                    if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                    else if(B == C && B == A){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }
                else{
                    System.out.println("NAO FORMA TRIANGULO");
                }
            }
        }
        else if(A < C){
            double aux = A;
            A = C;
            C = aux;

            double trianguloReal = B + C;
            double quadradoDaSoma = Math.pow(B, 2) + Math.pow(C, 2);
        
            if(A < trianguloReal && Math.pow(A,2) == quadradoDaSoma){
                System.out.println("TRIANGULO RETANGULO");

                if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else if(B == C && B == A){
                    System.out.println("TRIANGULO EQUILATERO");
                }
            }                                 
            else if(A < trianguloReal && Math.pow(A,2) > quadradoDaSoma){
                System.out.println("TRIANGULO OBTUSANGULO");

                if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else if(B == C && B == A){
                    System.out.println("TRIANGULO EQUILATERO");
                }
            }
            else if(A < trianguloReal && Math.pow(A,2) < quadradoDaSoma){
                System.out.println("TRIANGULO ACUTANGULO");

                if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else if(B == C && B == A){
                    System.out.println("TRIANGULO EQUILATERO");
                }
            }
            else{
                System.out.println("NAO FORMA TRIANGULO");
            }
            
        }
        else{
            double trianguloReal = B + C;
            double quadradoDaSoma = Math.pow(B, 2) + Math.pow(C, 2);
        
            if(A < trianguloReal && Math.pow(A,2) == quadradoDaSoma){
                System.out.println("TRIANGULO RETANGULO");

                if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else if(B == C && B == A){
                    System.out.println("TRIANGULO EQUILATERO");
                }
            }                                 
            else if(A < trianguloReal && Math.pow(A,2) > quadradoDaSoma){
                System.out.println("TRIANGULO OBTUSANGULO");

                if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else if(B == C && B == A){
                    System.out.println("TRIANGULO EQUILATERO");
                }
            }
            else if(A < trianguloReal && Math.pow(A,2) < quadradoDaSoma){
                System.out.println("TRIANGULO ACUTANGULO");

                if(B == C && A!=B || B == A && B != C || A == C && A !=B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else if(B == C && B == A){
                    System.out.println("TRIANGULO EQUILATERO");
                }
            }
            else{
                System.out.println("NAO FORMA TRIANGULO");
            }
        }
    }
}
