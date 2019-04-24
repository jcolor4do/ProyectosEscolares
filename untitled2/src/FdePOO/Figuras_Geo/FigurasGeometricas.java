package FdePOO.Figuras_Geo;
import java.util.Scanner;
public class FigurasGeometricas {
    public static void main(String[] args) {
        int op;
        Scanner sc=new Scanner(System.in);
        Cuadrado cuadrado= new Cuadrado();
        Rectangulo rectangulo= new Rectangulo();
        Triangulo triangulo=new Triangulo();
        System.out.println("Figuras Geométricas:");
        do {
            System.out.println("Selecciona el caso a resolver:\n 1)Cuadrado\n 2)Rectángulo\n 3)Triangulo\n 4)Salir");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Trabajando en la figura geométrica:" + cuadrado.Nombre());
                    System.out.println("El dato ingresado fue:" + cuadrado.getValor1());
                    System.out.println("El resultado del área es:" + cuadrado.area());
                    break;
                case 2:
                    System.out.println("Trabajando en la figura geométrica:" + rectangulo.Nombre());
                    System.out.println("El dato ingresado fue:" + rectangulo.getValor1()+","+rectangulo.getValor2());
                    System.out.println("El resultado del área es:" + rectangulo.area());
                    break;
                case 3:
                    System.out.println("Trabajando en la figura geométrica:" + triangulo.TipoTriangulo());
                    System.out.println("Los datos ingresados fueron:" + triangulo.getValor1()+","+triangulo.getValor2());
                    System.out.println("El resultado del área es:" + triangulo.area());
                    break;
                case 4:
                    break;

            }
        }while (op!=4);
    }
}
