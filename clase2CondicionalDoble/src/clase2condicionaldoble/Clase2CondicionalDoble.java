package clase2condicionaldoble;

import java.util.Scanner;

public class Clase2CondicionalDoble {
    public static void main(String[] args) {
        /*
        //Estructura condicional Doble
        if(false){
                //acciones a ejecutar si la condicion es TRUE
        }else{
            //acciones a ejecutar si la condicion es FALSE
        }*/
 /* 1 ) Desarrollar un algoritmo que permita determinar si un número 
ingresado por teclado es positivo o negativo. */
            int numeroIngresado = 0 ;
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Ingresar un número entero distindo de Cero");
            numeroIngresado = teclado.nextInt();
            
            if(numeroIngresado > 0 )
                System.out.println("el numero ingresado es Positivo ");
            else
                System.out.println("el numero ingresado es Negativo ");
            
                

    }

}
