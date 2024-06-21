package autodic;

import java.util.Scanner;
import java.util.Random;

public class Ejer2 {


    public static void MuestraMatriz(int[][] matriz){

        for(int f = 0; f < matriz.length; f++){

            for(int c = 0; c < matriz[f].length; c++){

                System.out.print(matriz[f][c]  + " ");

            }

            System.out.println();


        }


    }




    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random Random = new Random();

        int[][] matriz = new int[3][3];
        int[][] matrizEnemiga = new int[3][3];

        System.out.println("PREPARADO PARA EL JUEGO!!!??");
        System.out.println("Elije a los numeros con los que vas a Entrar a Batalla!!");
        for(int f = 0; f < matriz.length; f++){

            for(int c = 0; c < matriz[f].length; c++){

                System.out.println("Posicion : "+f+" "+c+" ");
                matriz[f][c] = entrada.nextInt();

            }


        }


        System.out.println("Este es el enemigo con el que vas entrar en Batallar");
        for(int f = 0; f < matrizEnemiga.length; f++){

            for(int c = 0; c < matrizEnemiga[f].length; c++){

                matrizEnemiga[f][c] = Random.nextInt(100
                );

            }


        }

        System.out.println("Tu Matriz");
        MuestraMatriz(matriz);

        System.out.println("Matriz Enemiga");
        MuestraMatriz(matrizEnemiga);



    }


    }




