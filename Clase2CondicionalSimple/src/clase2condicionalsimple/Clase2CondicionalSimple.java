package clase2condicionalsimple;

import java.util.Scanner;

public class Clase2CondicionalSimple {

    public static void main(String[] args) {
        int edad = 22;
        //Condicional Simple

        int sueldo = 1000;
        System.out.println("inicio app");

        if (edad >= 18) {
            //sentencias a ejecutar si la condicion se cumple 
            //cuerpo del If
            System.out.println("es mayor de edad");
            if (sueldo < 1000) {
                System.out.println("usted Cobra mas de mil dolares!");
            }
        }

        System.out.println("fin app");

//       si<condicion>entonces
//               
//       fin-si         
//Ejercicios de ejemplo:
//1) Implementar un algoritmo que calcule y muestre por pantalla el valor 
//final de la compra de un artículo. El algoritmo debe permitir el ingreso del 
//precio del artículo y la cantidad de artículos. Si el subtotal es superior a 
//1000, entonces se debe aplicar un descuento del 10 %.
        float cantidad = 0, precio = 0, descuento = 0, subtotal = 0, totalCompra = 0;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Cálculo de la compra de un artículo");
        
        System.out.println("ingrese el precio del artículo");
        precio = teclado.nextFloat();
        System.out.println("ingrese la cantidad de artículos a comprar");
        cantidad = teclado.nextFloat();
                
        subtotal = precio * cantidad ; 
        
        if(subtotal > 1000){
            descuento = subtotal * 0.10f ;
        }    
        
        totalCompra = subtotal - descuento ; 
        
        if( descuento > 0){
            System.out.println("Se aplicó un descuento de : " + descuento + " Dolares");
        }
        
        System.out.println("El valor final de la compra es : " + totalCompra + " Dolares");
        
                
    }

}
