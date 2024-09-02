package practico1;

public class Teaser {
    public static void main(String[] args) {


        PolizaInmuebleEscolar pol1  = new PolizaInmuebleEscolar(1 , 2000 , 300.25 , 4 , 5 , 1700 , 8500);

        System.out.println("El costo de la poliza es : " + pol1.obtenerCostPoliza());

    }
}
