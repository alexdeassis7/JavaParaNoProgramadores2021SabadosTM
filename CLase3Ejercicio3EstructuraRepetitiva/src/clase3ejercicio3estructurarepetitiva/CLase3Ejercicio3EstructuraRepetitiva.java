/*3)	Leer 10 números e imprimir solamente los positivos */
package clase3ejercicio3estructurarepetitiva;

import java.util.Scanner;

public class CLase3Ejercicio3EstructuraRepetitiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0, contador = 1;

        do {
            
            System.out.println("Ingrese el numero " + contador);
            numeroIngresado = teclado.nextInt();
            if(numeroIngresado > 0){
                System.out.println(numeroIngresado + " Es Positivo");
            }
            contador++;
            
        } while (contador <= 10);
        
        System.out.println("Fin del programa");
    }

}
