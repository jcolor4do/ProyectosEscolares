package com.bstmexico;
import java.util.Scanner;
public class Tipo_Datos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nombre;
        Byte edad;
        float promedio;

        String [] carreras;
        carreras=new String[3];
        Scanner sc= new Scanner(System.in);
        System.out.println("CUAL ES TU NOMBRE:\n" );
        nombre=sc.nextLine();

        System.out.println("CUAL ES TU EDAD: \n");
        edad=sc.nextByte();

        System.out.println("CUAL ES TU PROMEDIO DE BACHILLERATO:\n");
        promedio=sc.nextFloat();

        // sc.nextLine();

        System.out.println("CUAL ES TU PRIMERA OPCION: \n");
        carreras[0]=sc.nextLine();

        System.out.println("CUAL ES TU SEGUNDA OPCION: \n");
        carreras[1]=sc.nextLine();

        System.out.println("CUAL ES TU TERCERA OPCION: \n");
        carreras[2]=sc.nextLine();

        System.out.println("Tu nombre es :"+nombre );
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu promedio es "+promedio);
        System.out.println("Tu primera opcion es "+ carreras[0]);
        System.out.println("Tu segunda opcion es "+ carreras[1]);







    }

}
