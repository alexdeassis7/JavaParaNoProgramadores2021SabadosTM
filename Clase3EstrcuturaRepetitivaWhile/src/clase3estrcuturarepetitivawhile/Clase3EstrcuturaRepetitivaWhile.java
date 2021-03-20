package clase3estrcuturarepetitivawhile;

import java.util.Scanner;

public class Clase3EstrcuturaRepetitivaWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float temperaturaMaximoDelDia = 0 ;
        int contador = 1;
        
        //puede que las sentencias definidas en la estructura while nunca se ejecuten 
        //si la condicion es FALSE
        while (contador <= 5 ) { //LOOP INFINITO
            
            System.out.println("Ingrese la temp max del dia  " + contador);
            temperaturaMaximoDelDia = teclado.nextFloat();
            contador = contador + 1 ;
            //contador ++; //incremento la variable contador en 1 
        }
        
        System.out.println("Fin app ");
        
    }

}
