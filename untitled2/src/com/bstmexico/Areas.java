
//1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla
//Aquí te mostramos que necesita cada figura:
//Circulo: (radio^2)*PI
//Triangulo: (base * altura) / 2
  //      Cuadrado: lado * lado

public class Areas {
        public static void main(String[] args) {
            Areas areas = new Areas();
            System.out.println("el  área del círculo es:" + areas.circulo(2) );
            System.out.println("el  área del círculo es:" + areas.circulo(4) );

            System.out.println("el  área del círculo es:" + areas.triangulo(3, 4) );
            System.out.println("el  área del círculo es:" + areas.triangulo(3, 6) );

            System.out.println("el  área del círculo es:" + areas.cuadrado(4) );
            System.out.println("el  área del círculo es:" + areas.cuadrado(8) );


        }


    public double circulo( Integer radio) {
        double respuesta1;
        respuesta1 =  3.1416*(radio*radio);

       return respuesta1;
        }


        public double triangulo (Integer base, Integer altura){
        double respuesta2;
        respuesta2= (base * altura) / 2;
        return respuesta2;
        }

        public double cuadrado (Integer lado){
        double respuesta3;
        respuesta3= (lado*lado);
        return respuesta3;
        }
}
