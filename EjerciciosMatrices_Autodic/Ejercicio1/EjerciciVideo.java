package Ejercicio1;

import javax.swing.*;
import java.util.Scanner;

public class EjerciciVideo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int matriz[][] , nfilas , ncol;


        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));

        matriz = new int[nfilas][ncol];

        System.out.println("ingrese la matriz");

        for(int i = 0; i < nfilas; i++){

            for (int j = 0; j < ncol; j++){

                System.out.println("Matriz ["+ i +"]["+ j + "]");
                matriz[i][j] = entrada.nextInt();
            }



        }

        for(int f = 0; f < nfilas; f++){

          for(int c = 0; c < ncol; c++){
              System.out.print(matriz[f][c]);
          }
          System.out.println(" ");

        }

    }


}
