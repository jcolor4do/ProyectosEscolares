package com.bstmexico.Practicar;
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        int[] num;
        int i = 0;
        num = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa 9 números enteros:");

        System.out.println("1ER DATO: \n");
        num[0] = sc.nextInt();

        System.out.println("2DO DATO: \n");
        num[1] = sc.nextInt();

        System.out.println("TERCER DATO: \n");
        num[2] = sc.nextInt();

        System.out.println("4TO DATO: \n");
        num[3] = sc.nextInt();

        System.out.println("5TO DATO: \n");
        num[4] = sc.nextInt();

        System.out.println("6TO: \n");
        num[5] = sc.nextInt();

        System.out.println("7MO DATO: \n");
        num[6] = sc.nextInt();

        System.out.println("8VO DATO: \n");
        num[7] = sc.nextInt();

        System.out.println("9NO DATO: \n");
        num[8] = sc.nextInt();


        if (num[0] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 1");
        }
        if (num[1] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 2");
        }
        if (num[2] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 3");
        }
        if (num[3] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 4");
        }
        if (num[4] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 5");
        }
        if (num[5] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 6");
        }
        if (num[6] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 7");
        }
        if (num[7] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 8");
        }
        if (num[8] == 5) {
            System.out.println("Ingresaste el número 5 y se encuentra en la posición 9");
        }
        if (num[i] != 5) {
            System.out.println("No ingresaste el número 5");
        }
    }
}
