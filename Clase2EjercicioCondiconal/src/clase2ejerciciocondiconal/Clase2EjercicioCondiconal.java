/*3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. */
package clase2ejerciciocondiconal;

import java.util.Scanner;
public class Clase2EjercicioCondiconal {
    public static void main(String[] args) {
        int hsTrabajadas = 0 , hsExtras = 0 , salarioSemanal = 0 ;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese por favor las horas trabajadas durante esta semana");
        hsTrabajadas = teclado.nextInt();
        
        if( hsTrabajadas > 40 ) {
            hsExtras = hsTrabajadas - 40 ;
            salarioSemanal = hsExtras * 20 + 40 * 16 ;
        }else {
            salarioSemanal = hsTrabajadas * 16 ;
        }
        
        System.out.println("El salario semanal es de : " + salarioSemanal + " pesos.");
    }
    
}
