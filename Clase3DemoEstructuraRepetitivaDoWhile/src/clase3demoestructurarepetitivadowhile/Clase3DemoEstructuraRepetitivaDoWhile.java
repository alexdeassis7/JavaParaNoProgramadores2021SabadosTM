package clase3demoestructurarepetitivadowhile;
// Desarrollar un algoritmo que permita ingresar 10 números enteros por 
// teclado y que muestre por pantalla el promedio.

import java.util.Scanner;

public class Clase3DemoEstructuraRepetitivaDoWhile {

    public static void main(String[] args) {
        float numeroIngresado = 0, acumuladorNumeros = 0, promedioNumeros = 0;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inicio del do While");

        do{
            System.out.println("Ingrese el numero " + contador);
            numeroIngresado = teclado.nextFloat();
            acumuladorNumeros = acumuladorNumeros + numeroIngresado;
            contador++;
        } while (contador <= 10);

        //calculo el promedio 
        promedioNumeros = acumuladorNumeros / 10;

        System.out.println("El Promedio de los 10 numeros es : " + promedioNumeros);
        System.out.println("Fin del do While");

    }

}
