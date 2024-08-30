package Ejercicio8;


public class Calculadora implements Calculable{

    private int op1;
    private int op2;

        public Calculadora (int op1 , int op2 ){

            this.op1 = op1;
            this.op2 = op2;


        }


    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }


    @Override
    public void calcular() {

        System.out.println("La suma es "+ (getOp1() + getOp2())) ;
    }

    @Override
    public void calcular(int op ) {

            System.out.println("La resta es "+ ( getOp1() - getOp2()) ) ;
    }

    @Override
    public void calcular(double op){

            System.out.println("La division es: " + (getOp1() / getOp2()));
    }

    @Override
    public void calcular(boolean op ) {

            System.out.println("La multiplicion es " + (getOp1() * getOp2()));
    }



}


