package Ejercicio4;


// Escribir un método que dada una matriz de enteros y un entero que representa un índice de
// columna, devuelva la fila que contiene el máximo elemento de esa columna.

public class NumeroMayorDeFila {

    public static void main(String[] args) {
        int matriz[][] =
                {
                        {8, 6},
                        {9, 5}
                };
        int columna = 0;

        int posicion = mayorFila(matriz, columna);
        System.out.print("El mayor se encuentra en la posicion: "+ posicion);
    }


    public static int mayorFila(int matriz[][], int col){
        int mayor = matriz[0][col];
        int f = 0;
        for(int fila=1; fila < matriz[col].length ; fila++){
            if(mayor < matriz[fila][col]){
                mayor = matriz[fila][col];
                f = fila;
            }
        }
        return f;
    }




}



