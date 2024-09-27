package model;

public class Habilidades {

    private double ira;
    private int enojo;
    private double velocidad;
    private double fuerza;


    public Habilidades( double ira, double velocidad) {
        this.ira = ira;
        this.velocidad = velocidad;
    }

    public Habilidades() {

    }


    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public int getEnojo() {return enojo;}

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
}
