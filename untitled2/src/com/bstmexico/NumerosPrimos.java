package com.bstmexico;
import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        //Crea una aplicación que nos pida un número por teclado
        //y con un método se lo pasamos por parámetro para que nos indique si es o no un número primo,
        //debe devolver true si es primo sino false.
        int num;
        System.out.println("Ingresa un número");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        NumerosPrimos primoo = new NumerosPrimos();


            System.out.print("el resultado es:"+primoo.primo(num));
    }

    public int primo(Integer num) {
        if (num == num / 1) {
            System.out.print("el numero que se introdujo es: par");
        }
        else{
            System.out.print("el numero que se introdujo no es primo ");
        }
        return num;
    }
}


