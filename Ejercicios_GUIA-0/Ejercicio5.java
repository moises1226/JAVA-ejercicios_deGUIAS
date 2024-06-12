//Ejercicio 5
//Crear un programa que pida al usuario un número entero y muestre si es positivo, negativo o cero.

import java.util.Scanner;
public class Ejercicio5
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese el numero");
        num1 = nuevoValor.nextInt();
        if ( num1 >= 1){
            System.out.println("EL numero ingreado es positivo");
        }
        else if( num1 <= -1 ){
            System.out.println("EL numero ingresado es negativo");
        }
        else{
            System.out.println("El numero ingresado es 0");
        }
    }
}
