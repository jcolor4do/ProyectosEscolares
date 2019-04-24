import java.util.Scanner;
public class Cuadrado extends FigurasGeometricas {
    public static void main(String args[]) {
    }
        String mensaje;
        Integer valor1, A;
        public String Nombre () {
            mensaje = "Cuadrado";
            return mensaje;
        }
Scanner sc= new Scanner(System.in);
    public Integer getValor1() {
        System.out.print("ingresa el primer valor:");
        valor1=sc.nextInt();
        return valor1;
    }

    public int area() {
        A= valor1*valor1;
    return A;
    }
}
