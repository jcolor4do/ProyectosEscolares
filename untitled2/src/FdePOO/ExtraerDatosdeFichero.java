package FdePOO;
import com.bstmexico.Practicar.Extra;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ExtraerDatosdeFichero {

    public static void main(String[] args) {

        //try {

            File fichero_salida = null;

            File archivo = new File("C:/Users/Jacquelaina/Desktop/Pruebaaaa.txt");
            if (!archivo.exists()) {
                System.out.println("No existe el fichero de entrada especificado");
            } else {
                //Scanner scan = new Scanner(archivo);
                ArrayList<String> datosDeEntrada = new ArrayList<String>();
                int contador = 0;
                //  while (scan.hasNext()) {
                //     String lineaExtraida = scan.nextLine();
                //     datosDeEntrada.add(lineaExtraida);
                contador++;
                // }

                //  System.out.println("El número de líneas en el fichero de entrada es: " + contador);

//                String[] datosDeEntradaArray = new String[contador];

                //              for (int i = 0; i < datosDeEntradaArray.length; i++) {
                //                datosDeEntradaArray[i] = datosDeEntrada.get(i);
                //              System.out.println("Mostrando línea en fichero " + (i + 1) + ": " + datosDeEntradaArray[i]);
                //        }


            }

//        }
    }
}
