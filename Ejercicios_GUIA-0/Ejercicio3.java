//Ejercicio 3
//Crear un programa que pida al usuario dos números enteros para calcular su suma, su resta, su producto y su cociente y muestre los resultados por pantalla.
import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args) {
        Scanner nuevoValor = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int resta;
        double cociente;
        int producto;
        System.out.println("Ingrese los 2 numero enteros: ");
        num1 = nuevoValor.nextInt();
        num2 = nuevoValor.nextInt();
        sum = num1 + num2 ;
        resta = num1 - num2;
        cociente = (double) num1 / num2;
        producto = num1 * num2;
        System.out.println("La suma de los numeros enteros es: " + sum); System.out.println("La resta de los numeros enteros es: " + resta); System.out.println("El producto de los numeros enteros es: " + producto); System.out.println("El cociente de los numeros enteros es: " + cociente);
    }
}
