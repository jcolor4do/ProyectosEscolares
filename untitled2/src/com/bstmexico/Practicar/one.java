package com.bstmexico.Practicar;
//1. Programa java que realice lo siguiente: declarar una variable N de tipo int,
// una variable A de tipo double y
// una variable C de tipo char y asigna a cada una un valor.
// A continuación muestra por pantalla:
// El valor de cada variable, la suma de N + A, la diferencia de A - N,
// el valor numérico correspondiente al carácter que contiene la variable C.

public class one {
    public static void main(String[] args) {

        int N =4;
        double A= 5;
       char h= 'a';
        //double suma;
        //double resta;


        System.out.println("El valor de la variable N es:"+N);
        System.out.println("El valor de la variable A es:" + A);
        System.out.println("el caracter es " + h);

        //suma= N+A;
        //resta= A-N;

       // System.out.println("el resultado de la suma es:" + suma);
       // System.out.println("el resultado de la resta es:" + resta);

        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + h + " = " + (int)h);




    }
}
