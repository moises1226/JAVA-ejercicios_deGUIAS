//Ejercicio 7
//Escribir un programa que lea diez números enteros y muestre por pantalla el promedio de ellos.

import java.util.Scanner;
public class Ejercicio7
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1 , promedio = 0, sum = 0;

            System.out.println("Ingrese 10 numeros");
            for (int i = 0; i < 10 ; i++) {

                System.out.println("Ingrese el numero:  ");
                num1 = nuevoValor.nextInt();
                sum += num1;
                promedio = sum / 10;

            }

            System.out.println("El promedio de los numeros ingresados es: " + promedio);




    }
}
