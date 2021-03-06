/*un maestro desea saber que porcentaje de hombres y que porcentaje 
de mujeres hay en un grupo de estudiantes */
package clase1ejerciciosecuelcial3;

import java.util.Scanner;

public class Clase1EjercicioSecuelcial3 {

    public static void main(String[] args) {
        //DEFINO MIS VARIABLES DE TRABAJO
        float numHombres = 0 , numMujeres = 0 , totalAlumnos = 0 ;
        float porcerntajeH = 0 ,porcerntajeM = 0 ;
        Scanner teclado = new Scanner(System.in);
        
        //QUE ENTRA?
        System.out.println("ingrese el numero de mujeres ");
        numMujeres = teclado.nextFloat();
        System.out.println("ingrese el numero de Hombres ");
        numHombres = teclado.nextFloat();
              //QUE SE PROCESA? 
        totalAlumnos = numHombres + numMujeres;
        porcerntajeH = numHombres * 100 / totalAlumnos;  
        porcerntajeM = numMujeres * 100 / totalAlumnos;   
          //QUE SALE?
        
        System.out.println("El porcentaje de hombres es : " + porcerntajeH); 
        System.out.println("El porcentaje de mujeres es : " + porcerntajeM);
        
        
    }
    
}
 