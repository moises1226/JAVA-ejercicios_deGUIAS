package Ejercicio8;

public class CalculoCirculo implements Calculable{

    private double radio;


    public CalculoCirculo (double radio){
        this.radio  = radio;
    }

    public double getRadio(){
        return this.radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }


    @Override
    public void calcular() {
        double pi = 3.14;
        double area = pi * (Math.pow(getRadio() , 2));
        System.out.println("El area del circulo es : " + area);

    }
}
