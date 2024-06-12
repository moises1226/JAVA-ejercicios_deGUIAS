//Ejercicio 8
//Crear un programa que pida al usuario un número y muestre su tabla de multiplicar.

import java.util.Scanner;
public class Ejercicio8
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero para mostrar su tabla corespondiente"); num1 = nuevoValor.nextInt();
        System.out.println("La tabla de " + num1 + " es: ");
        for(int i = 0 ; i <= 10 ; i++){
            int produc;
            produc = num1 * i ;
            System.out.println(num1 + " x " + i + " = " + produc );
        }
    }
}
