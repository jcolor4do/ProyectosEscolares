package FdePOO.Figuras_Geo;
import javax.sql.rowset.spi.SyncFactory;
import java.util.Scanner;
public class Triangulo extends FigurasGeometricas {
    public static void main(String args[]) {
    }
    String mensaje;
    Integer valor1, valor2, A,a,b,c,B;

    Scanner sc = new Scanner(System.in);
    public String TipoTriangulo () {
        System.out.println("ingresa la medida del lado a:");
        a=sc.nextInt();
        System.out.println("Ingresa la medida del lado b");
        b=sc.nextInt();
        System.out.println("ingresa la medida del lado c");
        c=sc.nextInt();
        if (a==b && b==c){
            mensaje="Es un triangulo equilatero";
        }
        if (a==b && b!=c){
            mensaje="Es un triangulo iscoceles";

        }
        if (a!=b && b!=c){
            mensaje="Es un triangulo escaleno";
        }

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
        A = ((valor1 * valor2)/2);

        return A;
    }

}
