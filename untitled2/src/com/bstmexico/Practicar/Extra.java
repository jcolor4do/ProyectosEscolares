package com.bstmexico.Practicar;
import java.util.Scanner;
public class Extra {
    public static void main(String[] args) {
   // Digite e imprima por pantalla los datos para cada uno de los estudiantes de una universidad donde cada uno cursa cuatro materias y tienen los siguientes datos:
     //       -Código del estudiante -Materia -Créditos de la materia -Nota Utilice ciclo MQ.
    //me pueden ayudar con este ejercicio lo mas pronto pocible gracias

//declarando variables://
            String nombre;
            int matricula;

            String [] materias;
            materias=new String[4];
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingresa tu nombre completo:\n" );
            nombre=sc.nextLine();

            System.out.println("Ingresa tu matricula: \n");
            matricula=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingresa la primera materia que cursas: \n");
            materias[0]=sc.nextLine();

            System.out.println("Ingresa la segunda materia que cursas: \n");
            materias[1]=sc.nextLine();

            System.out.println("Ingresa la tercera materia que cursas: \n");
            materias[2]=sc.nextLine();

            System.out.println("Ingresa la cuarta materia que cursas: \n");
            materias[3]=sc.nextLine();

            System.out.println("Matricula:: "+matricula);
            System.out.println("Nombre completo :"+nombre );
            System.out.println("Las materias que cursas son:\n"+ materias[0] +"," + materias[1] +","+ materias[2] + "," + materias[3] );
        }
    }




