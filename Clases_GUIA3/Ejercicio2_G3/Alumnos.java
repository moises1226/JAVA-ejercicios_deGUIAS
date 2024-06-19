package Ejercicio2_G3;


public class Alumnos {

    private String nombre;
    private int edad;
    private int dni;
    private int anioNacimiento;

    public Alumnos(String nombre , int anioNacimiento, int dni){

        this.setnombre(nombre);
        this.setEdad(this.CalculadorEdad(anioNacimiento));
        this.setDni(dni);



    }

    public String getNombre(){return  this.nombre;}
    public void setnombre(String nombre){this.nombre = nombre;}

    public int getEdad(){return this.edad;}
    public void setEdad(int edad){this.edad = edad;}

    public int getDni(){return this.dni; }
    public void setDni(int dni){this.dni = dni;}


    public void DatosAlumno(){

        System.out.println("El alumno " + this.getNombre() + " con DNI " + this.getDni() + " tiene " + this.getEdad() + " años");
    }


    public int CalculadorEdad(int anio){

             return 2023 - anio;
    }


}