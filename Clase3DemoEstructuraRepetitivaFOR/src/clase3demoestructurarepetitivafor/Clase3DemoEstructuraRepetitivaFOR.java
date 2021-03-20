package clase3demoestructurarepetitivafor;

public class Clase3DemoEstructuraRepetitivaFOR {

    public static void main(String[] args) {

   
        //mostrar lo numeros 0 al 1000
        System.out.println("mostrar los numeros del 0 al 1000");
        for (int contador = 0; contador <= 1000; contador++) {
            //cuerpo del for 
            System.out.println(contador);
        }
        
        System.out.println("mostrar los numeros del 1000 al 0");
        //mostrar lo numeros 1000 al 0
        for (int contador = 1000; contador >= 0; contador--) {
            //cuerpo del for 
            System.out.println(contador);

        }
    }

}
