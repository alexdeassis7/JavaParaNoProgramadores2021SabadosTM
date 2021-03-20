/*4)	Leer 20 números e imprimir cuantos son positivos , 
cuantos negativos y cuantos neutros*/
package clase3ejercicio4estructurarepetitiva;

import java.util.Scanner;

public class Clase3Ejercicio4EstructuraRepetitiva {

    public static void main(String[] args) {

        System.out.println("Inicio de la app");
        int numeroIngresado = 0, contador = 1;
        int cantidadPositivos = 0, cantidadNegativos = 0, cantidadNeutros = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("ingrese el numero " + contador);
            numeroIngresado = teclado.nextInt();
            //con esta estructura condicional anidada
            //verificamos que numeros son positivos ,negativos o neutros .
            if (numeroIngresado > 0) {
                cantidadPositivos++;
            } else if (numeroIngresado < 0) {
                cantidadNegativos++;
            } else {
                cantidadNeutros++;
            }
            contador++;

        } while (contador <= 20);

        System.out.println("Cantidad de N° Positivos : " + cantidadPositivos);
        System.out.println("Cantidad de N° Negativos : " + cantidadNegativos);
        System.out.println("Cantidad de N° Neutros : " + cantidadNeutros);

        System.out.println("Fin de la app");

    }

}
