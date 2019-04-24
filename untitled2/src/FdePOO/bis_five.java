package FdePOO;
import java.util.Scanner;
//Colorado González Jacqueline, SEC 2NV21, Fundamentos de POO//
public class bis_five {
    public static void main(String[] args) {
    int [] arreglo;
    arreglo = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("***ALUMNA: COLORADO GONZÁLEZ JACQUELINE, 2NV12, FUNDAMENTOS DE POO***");
        System.out.println("ingresa 9 números enteros:");

        for (int i=0; i<arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
        }
        for (int i=0; i<arreglo.length; i++ ){
            if (arreglo[i]==5){
                System.out.println("Se encontró el número 5, se encuentra en la posición    "+i);
            }
        }
    }}
