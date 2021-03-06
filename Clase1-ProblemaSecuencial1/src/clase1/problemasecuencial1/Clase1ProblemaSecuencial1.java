/*Suponga que un individuo desea invertir su capital en un banco
y desea saber cuanto dinero ganara despues de un mes si el banco paga a razon de 2% mensual */
package clase1.problemasecuencial1;
//importando la libreria Scanner del package java.util

import java.util.Scanner;

public class Clase1ProblemaSecuencial1 {

    public static void main(String[] args) {
        //defino mis variables de trabajo 
        float capital = 0, ganancia = 0;
        //Me Creo un Scanner para poder tomar datos por teclado 
        Scanner teclado = new Scanner(System.in);
//        que entra?
        System.out.println("cual es el monto del capital a invertir");
        capital = teclado.nextFloat();
//        que procesa? 
        ganancia = capital * 0.02f;
//        que sale?
        System.out.println("su ganancia mensual sera de : " + ganancia + " dolares");
    }
}
