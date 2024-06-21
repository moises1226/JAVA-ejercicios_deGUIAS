package Ejercicio6_G5;

public class CargaDeInstancias {

    public static void main(String[] args){


        Matrix instancia1 = new Matrix(3, 4);

        instancia1.CargaMatrix();

        System.out.println("La cantidad de filas que tiene la matriz es: "+ instancia1.getRows());
        System.out.println("La cantidad de columnas que tiene la matriz es: "+ instancia1.getColumns());


    }



}
