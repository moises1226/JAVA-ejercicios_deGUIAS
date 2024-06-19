package Ejercicio4_G4;

public class Rectangle {

        double ancho;
        double longitud;
        double area;
        double perimetro;

        Rectangle(int ancho, int longitud){

            this.ancho  = ancho;
            this.longitud = longitud;
            this.area = longitud * ancho;
            this.perimetro = 2 * (longitud + ancho);

        }

        public double getAncho(){return ancho;}
        public void setAncho(int ancho){this.ancho = ancho;}

        public double getLongitud(){return longitud;}
        public void setLongitud(int longitud){this.longitud = longitud;}

        public double getArea(){return area;}
        public void setArea(double area){this.area = area;}

        public double getPerimetro(){return perimetro;}
        public void setPerimetro(double perimetro){this.perimetro = perimetro;}


    public static void main(String[] args){


            Rectangle obejt1 = new Rectangle( 21,20);

            System.out.println("El ancho es: " + obejt1.getAncho());
            System.out.println("Es perimetro es: " + obejt1.getPerimetro());


    }


}


