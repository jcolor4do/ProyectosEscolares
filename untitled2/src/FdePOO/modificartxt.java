package FdePOO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class modificartxt {
    public static void main(String[] arg) throws IOException {

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("C:/prueba.txt", true));
            out.write("Hola");
            out.write("línea 1");
            out.newLine();
            out.write("línea 2");
        } catch (IOException e) {
            // error processing code
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}


