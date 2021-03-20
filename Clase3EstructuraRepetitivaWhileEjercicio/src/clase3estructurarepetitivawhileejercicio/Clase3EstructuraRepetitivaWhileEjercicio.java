//MOSTRAR POR PANTALLA LOS NUMEROS PARES ENTRE 0 Y 100000 .
package clase3estructurarepetitivawhileejercicio;

public class Clase3EstructuraRepetitivaWhileEjercicio {

    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 100000) {
            System.out.println("numero : " + contador);
            contador = contador + 2;

            //contador ++;
            //contador = contador + 1 ;
            // contador +=1;
        }

    }

}
