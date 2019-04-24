package FdePOO;
import java.io.*;
import java.util.StringTokenizer;
public class obtenervariables {

            public static void main(String[] args) {


                String numeros = "1-2-3";
                int[] arreglo = new int[5];

                StringTokenizer aaaaa = new StringTokenizer(numeros, "-");
                int numeroTokens = aaaaa.countTokens();

                for(int i =0; i<numeroTokens;i++)
                {
                    arreglo[i]= Integer.parseInt(aaaaa.nextToken());
                }

                for(int i =0; i<numeroTokens;i++)
                {
                    System.out.println(arreglo[i]);
                }

            }

        }
