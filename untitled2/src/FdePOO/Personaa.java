package FdePOO;
import java.util.Scanner;
public class Personaa {
    public static void main(String[] args) {
        Personaa Jacqueline = new Personaa();
        int op;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Selecciona una opción:\n 1)Ingresar Datos\n 2)Imprimir Datos\n 3)Dormir\n 4)Contar\n 5)Hablar\n 6)Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("ingresa los datos que se te piden:");
                    Jacqueline.getnombre();
                    Jacqueline.getEdad();
                    Jacqueline.getGenero();
                    Jacqueline.getEstadocivil();
                    break;
                case 2:
                    System.out.println("Datos ingresados:");
                    System.out.println("Nombre:" + Jacqueline.nombre);
                    System.out.println("Edad:" + Jacqueline.edad);
                    System.out.println("Género:" + Jacqueline.genero);
                    System.out.println("Estado Civil:\n" + Jacqueline.estadocivil);
                    break;
                case 3:
                    System.out.println(Jacqueline.dormir());
                    break;
                case 4:
                    System.out.println(Jacqueline.contar());
                    break;
                case 5:
                    System.out.println(Jacqueline.hablar());
                    break;
                case 6:
                    break;
            }
        } while (op != 6);
    }
    String nombre, estadocivil, genero, mensaje, edad;
    Scanner sc = new Scanner(System.in);

    public void getnombre() {
        System.out.println("Ingresa tu nombre completo:");
        nombre = sc.nextLine();
    }
    public void getEdad() {
        System.out.println("Ingresa tu edad:");
        edad = sc.nextLine();
    }
    public void getGenero() {
        System.out.println("¿Cuál es tu género?");
        genero = sc.nextLine();
    }
    public void getEstadocivil() {
        System.out.println("¿Cuál es tu estado civil?");
        estadocivil = sc.nextLine();
    }
    public String dormir() {
        mensaje = "zzz...ZZZ...zzz...";
        return mensaje;
    }
    public String contar() {
        mensaje = "1, 2, 3, 4, 5...";
        return mensaje;
    }
    public String hablar() {
        mensaje = "bla bla bla...";
        return mensaje;
    }
}


