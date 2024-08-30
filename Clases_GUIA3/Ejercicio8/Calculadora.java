package Ejercicio8;


public class Calculadora implements Calculable{

    private int op1;
    private int op2;
    private String operador;

        public Calculadora (int op1 , int op2 , String operador){

            this.op1 = op1;
            this.op2 = op2;
            this.operador = operador;

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

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }


    @Override
    public void calcular() {

            if (getOperador().equals("+")){
                System.out.println("El resultado es: " + getOp1() + getOp2());
            } else if ( getOperador().equals("-")) {

                System.out.println("El resultado es: " + (getOp1() - getOp2()));
            } else if (getOperador().equals("*")) {

                System.out.println("El resultado es: " + getOp1() * getOp2());
            } else if (getOperador().equals("/")) {
                if (getOp2() != 0){
                    System.out.println("El resultado es: " + (getOp1() / getOp2()));
                }else{

                   System.out.println("NO SE PUEDE DIVIDIR POR 0 ");

                }

            }

    }


}
