package com.sm.model;

import java.util.List;

public class Materia {

    private String nombre;
    private double notaMateria;
    private Alumno alumno;

        public Materia (String nombre , double notaMateria){
            this.nombre = nombre;
            this.notaMateria = notaMateria;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMateria() {
        return notaMateria;
    }

    public void setNotaMateria(double notaMateria) {
        this.notaMateria = notaMateria;
    }

    public String toString(){

       return getNombre() + " ("+ getNotaMateria() +")";
    }


    public String NotaEstudiante(String nombre) {


        if(nombre.equals(alumno.getNombre())){

            return "Alumno: " + alumno.getNombre()+ " " + "Materia: " + getNombre();
        }else{

            System.out.println("El nombre Alumno que puso no existe");

            return null;

        }





    }


}
