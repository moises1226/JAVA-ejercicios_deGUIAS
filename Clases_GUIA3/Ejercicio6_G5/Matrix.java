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


import java.util.Random;
import java.util.Scanner;

public class Matrix {

        private int rows;
        int columns;
        double[][] matrix;


        Matrix(int rows, int columns){

            this.rows = rows;
            this.columns = columns;
            this.matrix = new double[this.rows][this.columns];
        }

        public int getRows(){
            return this.rows;
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


        public double[][] getMatrix(){

            return  matrix;

        };

        public void setMatrix (double[][]matrix){

            this.matrix = matrix;
        };

    public  void CargaMatrix(){



            for (int f = 0; f < this.matrix.length; f++){

                for (int c = 0; c < this.matrix[f].length; c++){

                    double numero = Math.random() * 100;
                    this.CargarPosicionMatriz(f,c,numero);

                }



            }

             System.out.println("Las matrices cargadas son: ");
             MuestraMatrix();




    }

    public void  CargarPosicionMatriz(int  fila , int colum, double value){


                this.matrix[fila][colum] = value;


    }

    public double  MostrarPosicionMatriz(int  fila , int colum){

        return this.matrix[fila][colum];

    }




    public void MuestraMatrix(){

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }







}







