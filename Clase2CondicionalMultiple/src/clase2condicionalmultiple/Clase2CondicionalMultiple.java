/*1) Desarrollar un algoritmo que permita ingresar un número entero
comprendido entre 1 y 7, y que muestre por pantalla el día de la semana al 
que se corresponde. 
 */
package clase2condicionalmultiple;

import java.util.Scanner;

public class Clase2CondicionalMultiple {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero entero comprendido entre 1 y 7");
        numeroIngresado = teclado.nextInt(); //leo el dato
        //condiciona multiple
        switch (numeroIngresado) {
            case 1:
                System.out.println("Es Domingo");
                break;
            case 2:
                System.out.println("Es Lunes");
                break;
            case 3:
                System.out.println("Es Martes");
                break;
            case 4:
                System.out.println("Es Miercoles");
                break;
            case 5:
                System.out.println("Es Jueves");
                break;
            case 6:
                System.out.println("Es Viernes");
                break;
            case 7:
                System.out.println("Es Sabado");
                break;     
            default:
                System.out.println("El numero " + numeroIngresado + " No se encuentra dentro del Rango 1 - 7");
                    
        }
        System.out.println("Fin app");

    }

}
