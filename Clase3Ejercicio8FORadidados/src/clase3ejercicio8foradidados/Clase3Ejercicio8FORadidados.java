/*8)	Simular el comportamiento de un reloj digital, 
imprimiendo la hora, minutos y segundos de un día desde
las 0:0:0 hasta las 23:59:59
 */
package clase3ejercicio8foradidados;

public class Clase3Ejercicio8FORadidados {

    public static void main(String[] args) {
//FOR ANIDADOS !
        System.out.println("Inicio de app");

        for (int hs = 0; hs <= 23; hs++) {//for que itera las horas

            for (int min = 0; min <= 59; min++) {//for que itera los minutos

                for (int seg = 0; seg <= 59; seg++) {//for que itera los Segundos

                    System.out.println(hs + ":" + min + ":" + seg);
                }
            }
        }

        System.out.println("Fin de app");

    }

}
