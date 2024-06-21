package Ejercicio5_G5;

public class Vector3D {


         double x;
         double y;
         double z;
         double norm;


                Vector3D(double x , double y , double z , double norm){

                         this.x = x;
                         this.y = y;
                         this.z = z;
                         this.norm = norm;

                }


                public double getX()
                {

                    return x;

                }
                public void setX(double x) {this.x = x;}

                public double getY() {return y;}
                public void setY(double y) {this.y = y;}

                public double getZ() {return z;}
                public void setZ(double z) {this.z = z;}

                public double getNorm() {return norm;}
                public void setNorm(double norm) {this.norm = norm;}



            public static void main(String[] args){

                    Vector3D instancia1 =  new Vector3D(5.6, 7, 20.1, 12.7);


                    System.out.println("El valor de x es: " + instancia1.getX());
                    System.out.println("El valor de y es: " + instancia1.getY());
                    System.out.println("El valor de z es: " + instancia1.getZ());
                    System.out.println("El valor de la normativa es: " + instancia1.getNorm());



            }


}



