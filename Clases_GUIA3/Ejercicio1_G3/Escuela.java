package Ejercicio1_G3;

public class Escuela {


    public static void main(String[] args){


        Alumnos Persona1 = new Alumnos("Moises", 17, 9495965);
        Alumnos Persona2 = new Alumnos("Jorge", 14, 1234566);


        Persona1.setEdad(20);

        Persona2.setEdad(19);

        Persona1.DatosAlumno();

        Persona2.DatosAlumno();

        System.out.println(Persona1.getNombre());



    }




}
