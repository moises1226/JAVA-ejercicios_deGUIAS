package Ejercicio3;

// Escribir un método que dada una matriz de enteros y un entero que representa un índice de
// fila, devuelva la columna que contiene el máximo elemento de esa fila.


public class NumeroMayorDeColumna {


    public static void main(String[] args) {
        int[][] matriz =
                {
                        {2, 3, 6},
                        {1, -5, 3}
                };
        int fila = 0;

        int posicion = mayorColumna(matriz, fila);
        System.out.print("El mayor se encuentra en la posicion: "+ posicion);
    }

    //devuelva la columna que contiene el máximo elemento de esa fila.
    public static int mayorColumna(int[][] matriz, int f){
        int mayor = matriz[f][0];
        int col = 0;
        for(int columna=1; columna < matriz[f].length ; columna++){
            if(mayor < matriz[f][columna]){
                mayor = matriz[f][columna];
                col = columna;
            }
        }
        return col;
    }



}
