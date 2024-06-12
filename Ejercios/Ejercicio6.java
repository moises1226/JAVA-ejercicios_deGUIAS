//Ejercicio 6
//Crear un programa que lea tres números enteros y muestre por pantalla el mayor y el menor de ellos.

import java.util.Scanner;
public class Ejercicio6
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese los numeros: ");
        num1 = nuevoValor.nextInt();
        num2 = nuevoValor.nextInt();
        num3 = nuevoValor.nextInt();
        if ( num1 > num2 && num1 > num3 ){
            System.out.println("EL numero " + num1 + " es mayor que " + num2 + " y " + num3 );
        }
        else if ( num2 > num1 && num2 > num3 ){
            System.out.println("EL numero " + num2 + " es mayor que " + num1 + " y " + num3 ); }
        else if ( num3 > num1 && num3 > num2 ){
            System.out.println("EL numero " + num3 +" es mayor que " + num1 + " y " + num3 ); }
    }
}
