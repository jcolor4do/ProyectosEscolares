package FdePOO;
import java.io.FileWriter;
import java.io.IOException;
import  java. util.Scanner;
public class UpdateFile {
    public static void main (String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        UpdateFile main = new UpdateFile();
        int op;
        FileWriter filewriter = new FileWriter("C:/Users/Jacquelaina/Desktop/Pruebaaaa.txt", true);
        filewriter.append("***Resultados:***\r\n");
        do {
            System.out.print("Selecciona una opción:\n 1)suma\n 2)resta\n 3)multiplicación\n 4)división\n 5)salir\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    filewriter.append(main.Sumar());
                    filewriter.append("\r\n");
                    filewriter.flush();
                    break;
                case 2:
                    filewriter.append(main.Restar());
                    filewriter.append("\r\n");
                    filewriter.flush();
                    break;
                case 3:
                    filewriter.append(main.Multiplicar());
                    filewriter.append("\r\n");
                    filewriter.flush();
                    break;
                case 4:
                    filewriter.append(main.Dividir());
                    filewriter.append("\r\n");
                    filewriter.flush();
                    break;
                case 5:
                    break;
            }
        } while (op != 5);
    }
        float x, y,  rsuma, rresta, rmulti, rdivi;
        String mensaje;
    public void datos () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        x = sc.nextFloat();
        System.out.println("Ingresa el segundo número");
        y = sc.nextFloat();
    }
    public String Sumar () {
        datos();
        rsuma = x + y;
       System.out.println("Este es el resultado de la suma:"+x+"+"+y+"="+rsuma);
        return mensaje="Este es el resultado de la suma:"+x+"+"+y+"="+rsuma;
    }
    public String Restar () {
        datos();
        rresta = x - y;
        System.out.println("Este es el resultado de la resta:"+x+"+"+y+"="+rresta);
        return  mensaje="Este es el resultado de la rest:"+x+"-"+y+"="+rresta;
    }
    public String Multiplicar () {
        datos();
        rmulti = x*y;
        System.out.println("Este es el resultado de la multiplicación:"+x+"+"+y+"="+rmulti);
        return  mensaje="Este es el resultado de la mult:"+x+"*"+y+"="+rmulti;
    }
    public String Dividir () {
        datos();
        if (x==0 && y==0){
            System.out.println("Resultado indefinido");
            System.out.println("Ingresa otros datos diferentes, por favor");
            datos();
            rdivi = x / y;
        }
        else rdivi = x / y;
        System.out.println("Este es el resultado de la división:"+x+"/"+y+"="+rdivi);
        return  mensaje="Este es el resultado de la divi:"+x+"/"+y+"="+rdivi;
    }
}


