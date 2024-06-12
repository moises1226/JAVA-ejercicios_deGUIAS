//Ejercicio 4
//Crear un programa que pida al usuario un número entero y muestre si es par o impar

import java.util.Scanner;
public class Ejercicio4
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese el numero: ");
        num1 = nuevoValor.nextInt();
        if(num1 % 2 == 0){
            System.out.println("El numero : " + num1 + " es PAR");
        }
        else{
            System.out.println("El numero " + num1 +" es INPAR"); }
    }
}
