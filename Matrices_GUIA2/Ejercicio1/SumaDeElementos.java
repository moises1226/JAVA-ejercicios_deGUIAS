package Ejercicio1;

//Escribir un método que dada una matriz de enteros devuelva la suma de los elementos que
//contiene la matriz.



public class SumaDeElementos {

    public static void main(String[] args) {
        int matriz[][] =
                {
                        {4, 1, 3},
                        {6, 4, 1}, //2x3
                };

        int suma=0;
        for(int fila=0; fila < matriz.length ; fila++){
            for(int columna=0; columna < matriz[0].length; columna++){
                suma =  suma + matriz[fila][columna];
            }
        }
        System.out.print(suma);

    }




}
