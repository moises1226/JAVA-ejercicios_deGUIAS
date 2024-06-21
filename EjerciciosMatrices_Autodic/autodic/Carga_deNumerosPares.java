package autodic;

import java.util.Scanner;

public class Carga_deNumerosPares {


    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero ;


        int[][] matriz = new int[2][2];


        System.out.println("Ingrese los numeros: ");
        for(int f = 0 ; f < matriz.length;f++){

            for(int c = 0; c < matriz.length ; c++){

                System.out.println("Posicion : "+f+" "+c+" ");
                numero = entrada.nextInt();

               if(numero % 2 == 0){

                   matriz[f][c] = numero;
                   System.out.println("Carga eitosa");


               }else{

                   System.out.println(" ");
                   System.out.println("El numero no fue cargado");
                   MuestraMatriz(matriz);
                   return;

               }



            }
        }





    }


    public static void MuestraMatriz(int[][] matris) {
        for (int f = 0; f < matris.length; f++) {
            for (int c = 0; c < matris[f].length; c++) {
                System.out.print(matris[f][c] + " ");
            }
            System.out.println();
        }
    }




}
