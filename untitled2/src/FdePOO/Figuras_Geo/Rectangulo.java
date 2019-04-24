package FdePOO.Figuras_Geo;
import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
    public static void main(String args[]) {
    }
    String mensaje;
    Integer valor1, valor2, A;

    Scanner sc = new Scanner(System.in);
    public String Nombre () {
        mensaje = "Rectángulo";
        return mensaje;
    }
    public Integer getValor1 () {
        System.out.print("ingresa el valor de la base:");
        valor1 = sc.nextInt();
        return valor1;
    }

    public Integer getValor2 () {
        System.out.print("ingresa el valor de la altura:");
        valor2 = sc.nextInt();
        return valor2;
    }
    public int area () {
        A = valor1 * valor2;
        return A;
    }
}
