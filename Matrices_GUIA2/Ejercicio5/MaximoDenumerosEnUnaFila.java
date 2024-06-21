package Ejercicio5;

public class MaximoDenumerosEnUnaFila {

        public static void main(String[] args){

            int[][] matriz =
                    {

                    {2, 3},
                    {4, 5}

                    };

            System.out.println("La fila que tiene el maximo de numeros es la " + FilaDeNumeroMayores(matriz));



        }


        public static int FilaDeNumeroMayores(int[][] matriz){


            int FilaMayor = 0;


            for (int f = 0; f < matriz.length - 1 ; f++) {

                for (int c = 0; c < matriz[f].length; c++) {


                    if(matriz[f][c] < matriz[f + 1][c]){

                        matriz[f][c] = matriz[f + 1][c];
                        FilaMayor++;

                    }


                }


            }


            return FilaMayor;


        }


        public static void MuestraMatriz(int[][] matriz){


            for (int f = 0 ; f < matriz.length ; f++ ){

                for (int c = 0; c < matriz[f].length; c++) {

                    System.out.print(matriz[f][c] + " ");

                }

                System.out.println(" ");
            }


        }




}
