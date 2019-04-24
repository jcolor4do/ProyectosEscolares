package FdePOO;
import java.util.Scanner;

public class If_del_bis_Funciones {
    public static void main(String[] args) {
        int[] arreglo;
        int op = ' ';

        arreglo = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("***ALUMNA: COLORADO GONZÁLEZ JACQUELINE, 2NV12, FUNDAMENTOS DE POO***");
        System.out.println("selecciona una opción para resolver este caso: 1) for, 2)while, 3)do-while");
        op = sc.nextInt();

        {
            System.out.println("ingresa 9 números enteros:");
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = sc.nextInt();
            }
        }
        if (op == 1) {
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == 5) {
                    System.out.println("Se encontró el número 5, se encuentra en la posición "+(i+1));
                }
            }
        }
        if (op == 2) {
            int a = 0;
            while (a < arreglo.length) {
                if (arreglo[a] == 5) {
                    System.out.println("Se encontró el número 5, se encuentra en la posición" + (a + 1));
                }
                a++;
            }
        }
        if (op == 3) {
            int u = 0;
            int e = 0;
            while (e < arreglo.length) {
                if (arreglo[e] == 5) {
                    System.out.println("Se encontró el número 5, se encuentra en la posición" + (e + 1));
                }
                e++;
            }
            }
}}