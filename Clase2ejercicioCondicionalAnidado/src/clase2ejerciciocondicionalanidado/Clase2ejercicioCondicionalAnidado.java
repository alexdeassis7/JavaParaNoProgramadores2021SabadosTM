/*1)	Leer dos números: si son iguales que los multiplique, si el primero es mayor
que el segundo que los reste y si no que los sume
 */
package clase2ejerciciocondicionalanidado;

import java.util.Scanner;

public class Clase2ejercicioCondicionalAnidado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUno = 0, numeroDos = 0;

        System.out.println("ingrese el numero uno ");
        numeroUno = teclado.nextInt();

        System.out.println("ingrese el numero dos ");
        numeroDos = teclado.nextInt();
        //ejemplo de if - else ANIDADOS!
        
        if (numeroUno == numeroDos ) {
            System.out.println("son iguales , se multiplican :" + numeroUno * numeroDos);
        }else if(numeroUno > numeroDos){
              System.out.println("num1 mayor a num2 ,se restan :" + (numeroUno - numeroDos));
        }else {
            System.out.println("num1 menor a num2 ,se suman :" + (numeroUno + numeroDos));
        }
      

    }

}
