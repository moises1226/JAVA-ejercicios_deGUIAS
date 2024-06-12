//Ejercicio 9
//Crear un programa que pida al usuario un número entero e informe si es primo o no.

import java.util.Scanner;
public class Ejercicio9
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1;
        boolean esPrimo = true;
        System.out.println("Ingrese un numero ");
        num1 = nuevoValor.nextInt();
        for (int i = 2; i < num1 ; i++ ){
            if (num1 % 2 == 0 ){
                esPrimo = false;
                break;
            }
        }
        if(esPrimo){
            System.out.println("El numero " + num1 + " es PRIMO ");
        }
        else{
            System.out.println("El numero " + num1 + " NO ES PRIMO");
        }
    }
}
