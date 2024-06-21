package Ejercicio2;

// Escribir un método que dada una matriz de enteros devuelva la cantidad de elementos
// positivos que contiene la matriz.


public class ContadorDeElementosPositivos {

    public static void main(String[] args) {

        int matriz[][] =

                {

                        {4, 1 , 3},
                        {6, 4, 1 },
                        {8 ,9 ,8},

                };

        int pos = contadorPositivos(matriz);
        System.out.printf("la cantidad de positivos son: "+ pos);

    }

    public static int contadorPositivos(int matriz[][]){
        int positivos = 0;

        for(int fila=0; fila < matriz.length ; fila++){
            for(int columna=0; columna < matriz[0].length; columna++){
                if(matriz[fila][columna] > 0 ){

                    positivos = positivos + 1;
                }


            }


        }

        return positivos;


    }





}
