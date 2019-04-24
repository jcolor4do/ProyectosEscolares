package FdePOO;
import java.util.Scanner;
public class CalculadoraconFunciones {
    public static void main(String[] args) {
        CalculadoraconFunciones main = new CalculadoraconFunciones();
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Selecciona una opción:\n 1)suma\n 2)resta\n 3)multiplicación\n 4)división\n 5)salir\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("el resultado de la suma es:" + main.Sumar());
                    break;
                case 2:
                    System.out.println("el resultado de la resta es:" + main.Restar());
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es:" + main.Multiplicar());
                    break;
                case 4:
                    System.out.println("el resultado de la división es:" + main.Dividir());
                    break;
                case 5:
                    break;
            }
        } while (op!=5);
    }
        float a, b, rsuma, rresta, rmulti, rdivi;
        public void datos () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa el primer número");
            a = sc.nextInt();
            System.out.println("Ingresa el segundo número");
            b = sc.nextInt();
        }
        public float Sumar () {
            datos();
            rsuma = a + b;
            return rsuma;
        }

        public float Restar () {
            datos();
            rresta = a - b;
            return rresta;
        }
        public float Multiplicar () {
            datos();
            rmulti = a * b;
            return rmulti;
        }
        public float Dividir () {
            datos();

                     if (a==0 && b==0){
                            System.out.println("Resultado indefinido");
                            System.out.println("Ingresa otros datos diferentes");
                            datos();
                         rdivi = a / b;
                         }
                         else rdivi = a / b;
        return rdivi;
        }

    }




