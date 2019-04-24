
package clases;

public class main {

    public static void main(String[] args) {
        //leer un TXT
        
        archivos a = new archivos();
        String s1 = a.leerTxt("C:\\DevelopersAzteca\\txt\\holamundo.txt");
        
        System.out.println(s1);
    }
}
