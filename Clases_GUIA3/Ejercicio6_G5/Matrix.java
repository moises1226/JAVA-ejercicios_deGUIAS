package Ejercicio6_G5;


// Crear una clase llamada Matrix que representa una matriz de números reales. Las instancias de la clase
// Matrix deben saber responder los siguientes mensajes:

// public int rows();
// Devuelve la cantidad de filas de la matriz.
// public int columns();
// Devuelve la cantidad de columnas de la matriz.
// public double get(int row, int column);
// Devuelve el valor que se encuentra en la fila row y columna column de la matriz.
// public void set(int row, int column, double value);
// Establece el valor que se encuentra en la fila row y columna column de la matriz al valor de value.

// La clase Matrix debe proveer al menos los siguientes constructores:
// public Matrix(int rows, int columns);
// Crea una matriz de rows filas y columns columas con todos los elementos inicializados a 0.


import java.util.Scanner;

public class Matrix {

        int rows;
        int columns;


        Matrix(int rows, int columns){

            this.rows = rows;
            this.columns = columns;



        }

        public int getRows(){
            return rows;
        }
        public void setRows(int rows){

            this.rows = rows;
        }
        public int getColumns(){
            return columns;
        }
        public void setColumns(int columns){

            this.columns = columns;
        }


    public  void CargaMatrix(){

            Scanner entrada = new Scanner(System.in);

            double[][] matrix = new double[rows][columns];
            double number;


            for (int f = 0; f < matrix.length; f++){

                for (int c = 0; c < matrix[f].length; c++){
                    System.out.println("Ingrese el numero para la posicion: "+f+ " " + c +  " ");
                    number = entrada.nextDouble();

                    matrix[f][c] = number;



                }



            }
            entrada.close();
             System.out.println("Las matrices cargadas son: ");
             MuestraMatrix(matrix);




    }

    public void MostrarPosicionMatriz(double fila , double colum){






    };





    public static void MuestraMatrix(double[][] matrix){

            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }


    }



}


