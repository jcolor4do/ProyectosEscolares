package com.bstmexico;
        import java.util.Scanner;

//Dados tres números calcule:
//       La suma de los tres
//     El promedio de los tres
//   El producto de los tres
public class UNO {
    public static void main(String[] args){
        UNO uno = new UNO();
        String variable = uno.laEdadDeJacquie(10);
        System.out.println(variable);
        System.out.println(uno.laEdadDeJacquie(12));


        System.out.println("la suma de" + uno.responderSuma(4 ,5));
        System.out.println("La suma de tus numeros es: " + uno.responderSuma(5,10));

        System.out.println("La suma de tus numeros es: " + uno.responderSuma(1,4));

        System.out.println("La suma de tus numeros es: " + uno.responderSuma(101,4098));
        System.out.println("La suma de tus numeros es: " + uno.responderSuma(23,544));
        System.out.println("La suma de tus numeros es: " + uno.responderSuma(13, 4));
    }

    public String laEdadDeJacquie(Integer edad){
        return ("La edad de jackie es: " + edad);
    }

    public int responderSuma(Integer a, Integer b)
    {
        int suma=0;
        for (int r=a; r<=b; r++){
           suma= r+suma;
        }
       return suma;

    }
}