package Ejercicio3_G3;

/*
    Crear una clase llamada Calculadora que permita ingresar dos números(atributos)
    y sepa responder a las siguientes consultas (utilizar solo una instancia para la comprobación):

  -  ¿Cuál es la suma entre 56 y 102?
  - ¿Cuál es la resta entre 73 y 21?
  -  ¿Cuál es la multiplicación entre 12 y 128?
  -  ¿Cuál es la división de 146 entre 18?


*/






public class Calculadora {

    int num1;
    int num2;

        Calculadora(int num1, int num2){

            this.num1 = num1;
            this.num2 = num2;

        }

        public int getNum1(){return num1;}
        public void setNum1(int num1){this.num1 = num1;}

        public int getNum2(){return num2;}
        public void setNum2(int num2){this.num2 =num2;}


        public int suma(){return num1 + num2;}

        public int resta(){return num1 - num2;}

        public int producto(){return num1 * num2;}

        public double cociente(){return (double) num1 / num2;}


        public static void main(String[] args){

            Calculadora objeto1 = new Calculadora(146,18);

            //System.out.println("La suma entre 56 y 102 es: " + objeto1.suma());

            //System.out.println("La resta entre 73 y 21 es: " + objeto1.resta());
            //System.out.println("la multiplicacion entre 12 y 128 es: " + objeto1.producto());
            System.out.println("El cociente entre 146 entre 18 es: " + objeto1.cociente());

        }


}
