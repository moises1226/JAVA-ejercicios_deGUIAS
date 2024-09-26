package model;

public class Pajaros extends Habilidades {

    private String nombre;
    private double peso;



    public Pajaros(String nombre, double peso, double ira, double velocidad) {
        super(ira, velocidad);
        this.nombre = nombre;
        this.peso = peso;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void FuerzaDePajaro() {

        double f = 0;
        String nombre = getNombre();

        if (nombre.equals("comun")) {
            f = getIra() * 2;
            System.out.println("La fuerza del pájaro es: " + f);

        } else if (nombre.equals("Red")) {
            f = (getIra() * 10) * getEnojo();

            System.out.println("La fuerza de Red es : " + f);
        } else if (nombre.equals("Bomb")) {

            f = getIra() * 2;

            if (f >= 9000) {
                System.out.println("Bomb no contuvo su fuerza y EXPLOTO!");
            } else {
                System.out.println("La fuerza de Bomb es " + f);
            }

        } else if (nombre.equals("Chuck")) {

            double velocidad = getVelocidad();
            boolean enojado = getEnojo() > 0;

                double velocidadCalculada = enojado ? velocidad * 2 : velocidad;

                if (velocidadCalculada <= 80) {
                    f = 150;
                } else {
                    f = 150 + (5 * (velocidadCalculada - 80));
                }
                System.out.println("La fuerza de Chuck es de " + f);

            } else if (nombre.equals("Terence")) {
                f = getIra() * getEnojo();
                System.out.println("La fuerza de Terence es: " + f );

            }else {

             System.out.println("fuerza de pajaro desconocida");

            }

            setFuerza(f);

    }

    public void EnojarPajaro(int enojar){

        setEnojo(enojar);
        System.out.println("Numero de enojos asignados a " + getNombre() + " son " + enojar);

    }





}