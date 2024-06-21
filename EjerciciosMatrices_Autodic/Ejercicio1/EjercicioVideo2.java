package Ejercicio1;

import javax.swing.*;
import java.util.Scanner;

//Crear y Cargar una matriz de tamaño n x m y decir si es simetrica o no.

public class EjercicioVideo2 {


    public static void MuestraMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }







    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        int[][] matriz;
        int nfilas , ncol;
        boolean simetrica = true;

        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila"));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la columna"));

        matriz = new int[nfilas][ncol];

        System.out.println("Ingrse los numeros");
        for (int f = 0; f < nfilas; f++){

            for (int c = 0; c < ncol; c++){
                //este println indica a cual posicion estamos asignando en numero
                System.out.println("Matriz [" + f + "] [" + c + "]");

                matriz[f][c] = entrada.nextInt();
            }
        }

        if (nfilas == ncol){ //estamos verficando si el numero de final es igual al numero de columnas.

                int i , j;
                i = 0;
                 while(i < nfilas && simetrica){
                     j= 0;
                     while(j < ncol && simetrica){

                         if(matriz[i][j]!= matriz[j][i]){

                             simetrica = false;
                         }
                         j++;
                     }
                     i++;

                 }

            if (simetrica){

                System.out.println("La matriz es simetrica");
                MuestraMatriz(matriz);

            }else{

                System.out.println("La matriz no es simetrica");
            }



        }else{

            System.out.println("La matriz no es simetrica");

        }



    }

}
