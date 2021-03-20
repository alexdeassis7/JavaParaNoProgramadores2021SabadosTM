package clase3demooperadorternario;

public class Clase3DemoOperadorTernario {

    public static void main(String[] args) {
        //Calcular el mayor de dos números diferentes!
        int num1 = 10, num2 = 120, mayor = 0;

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        System.out.println("el mayor es :" + mayor);
        //OPERADOR TERNARIO 
        System.out.println("OPERADOR TERNARIO ");
        //RESULTADO = (CONDICION ) ? VALOR1 :VALOR2 ;       
        mayor = (num1 > num2) ? num1 : num2;
        System.out.println("el mayor es :" + mayor);

    }

}
