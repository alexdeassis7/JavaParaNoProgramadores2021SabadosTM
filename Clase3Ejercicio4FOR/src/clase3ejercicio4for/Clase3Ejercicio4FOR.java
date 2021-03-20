/*4Leer 20 números e imprimir cuantos son positivos , 
cuantos negativos y cuantos neutros*/
package clase3ejercicio4for;

import java.util.Scanner;

public class Clase3Ejercicio4FOR {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);
        int cantidadNeutros = 0, cantidadPositivos = 0, cantidadNegativos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese el numero " + i);
            numeroIngresado = teclado.nextInt();

            if (numeroIngresado > 0) {
                cantidadPositivos++;
            } else if (numeroIngresado < 0) {
                cantidadNegativos++;
            } else {
                cantidadNeutros++;
            }
        }
        
        System.out.println("Cantidad de N° Positivos : " + cantidadPositivos);
        System.out.println("Cantidad de N° Negativos : " + cantidadNegativos);
        System.out.println("Cantidad de N° Neutros : " + cantidadNeutros);

        System.out.println("Fin de la app");
    }

}
