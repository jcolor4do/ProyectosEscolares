package com.bstmexico.Practicar;

public class four {
    public static void main (String[] args){

//Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
// A continuación realiza las instrucciones necesarias para que:
        //B tome el valor de C
       // C tome el valorz de A
        //A tome el valor de D
        //D tome el valor de B

        int A=1;
        int B=2;
        int C=3;
        int D=4;
        int aux;

        aux=A;
        D=B;
        A=D;
        C=A;
        B=C;


        System.out.println("el valor de B toma el valor de C");
        System.out.println("el valor de B toma el valor de C");
        System.out.println("el valor de B toma el valor de C");
        System.out.println("el valor de B toma el valor de C");




    }
}
