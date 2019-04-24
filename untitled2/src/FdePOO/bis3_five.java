//Colorado González Jacqueline, SEC 2NV21, Fundamentos de POO//
package FdePOO;
import java.util.Scanner;
public class bis3_five {
    public static void main(String[] args) {
        int[] arreglo;
        int i = 0;
        arreglo = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("***ALUMNA: COLORADO GONZÁLEZ JACQUELINE, 2NV12, FUNDAMENTOS DE POO***");
        System.out.println("ingresa 9 números enteros:");
        do {
            arreglo[i] = sc.nextInt();
            i++;
            }   while (i < 9);

        int a=0;
        while (a<arreglo.length){
            if (arreglo[a]==5) {
                System.out.println("Se encontró el número 5, se encuentra en la posición"+(a+1));
            }
            a++;
        }
    }
}