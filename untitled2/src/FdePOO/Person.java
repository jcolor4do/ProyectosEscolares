package FdePOO;

public class Person {


        protected int id;
        protected String nombre;
        protected String apellido;
        protected String correo;

        public Person(int id, String nombre, String apellido, String correo){
            this.id=id;
            this.nombre=nombre;
            this.apellido=apellido;
            this.correo=correo;
        }

public class Estudiante extends Person{

    private int codigo;
    private String facultad;

    public Estudiante(int id, String nombre, String apellido, String correo, int codigo, String facultad){
        super(id, nombre, apellido, correo);
        this.codigo=codigo;
        this.facultad=facultad;
    }
}

}


