//Ejercicio 2
//Crear un programa que pida al usuario un número entero y muestre por pantalla el doble y el triple de ese número.

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int numero1;
        int multi2;
        int multi3;
        System.out.println("Ingrese el numero: ");
        numero1 = nuevoValor.nextInt();
        multi2 = numero1 * 2;
        multi3 = numero1 * 3;
        System.out.println("El doble del "+ numero1 + " es " + multi2 );
        System.out.println("El triple del "+ numero1 +" es " + multi3 );
    }
}
