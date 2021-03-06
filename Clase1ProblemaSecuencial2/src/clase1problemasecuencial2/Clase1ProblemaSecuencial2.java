/*una Tienda Ofrece Un Descuento del 15%  sobre el total de la compra y un cliente desea 
saber cuanto pagara finalmente por su compra .*/
package clase1problemasecuencial2;
import java.util.Scanner;
public class Clase1ProblemaSecuencial2 {

    public static void main(String[] args) {
        //definimos una contante , VALOR INMUTABLE , se definen en mayuscula 
        final float PORCENTAJE = 0.15f;
        //defino mis variables de trabajo 
        float totalCompra = 0, descuento = 0, totaApagar = 0;
        Scanner teclado = new Scanner(System.in);
        //que entra? 
        System.out.println("Ingrese por favor el monto total de la compra");
        totalCompra = teclado.nextFloat();
        //que se procesa?
        descuento = totalCompra * PORCENTAJE;
        totaApagar = totalCompra - descuento;
        //que sale ?
        System.out.println("El total que debe abonar el cliente por su compra es : " + totaApagar);
        
        
    }

}
