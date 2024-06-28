package Ejercicio6_G5;

public class CargaDeInstancias {

    public static void main(String[] args){


        Matrix instancia1 = new Matrix(3, 4);

        System.out.println(instancia1.getRows());

        System.out.println("La cantidad de filas que tiene la matriz es: "+ instancia1.getRows());
        System.out.println("La cantidad de columnas que tiene la matriz es: "+ instancia1.getColumns());

        instancia1.CargaMatrix();








    }





    public static void mostrar(Matrix m){
        for(int i=0; i<m.getRows(); i++){
            for(int j=0; j<m.getColumns(); j++){
                System.out.println(m.MostrarPosicionMatriz(i, j));
            }
        }
    }



}
