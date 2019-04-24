package FdePOO;
import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
public class ExcepcionArchivo {
    private String rutaArchivo;
    private String linea;
    public ExcepcionArchivo(){
        System.out.println("ingresa la ruta:");

        this.rutaArchivo="c:/archivo.txt";
    }
    public void leerArchivo(){
        try{
            FileReader fr=new FileReader(rutaArchivo);
            BufferedReader entradaArchivo=new BufferedReader(fr);
            linea=entradaArchivo.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea=entradaArchivo.readLine();
            }
        }catch(IOException ex){
            System.out.println("Error en la apertura del archivo "+ex.toString());
        }
    }
    public static void main(String[] args) {
        ExcepcionArchivo ea=new ExcepcionArchivo();
        ea.leerArchivo();
    }
}
