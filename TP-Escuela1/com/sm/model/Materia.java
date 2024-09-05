package com.sm.model;

import java.util.List;

public class Materia {

    private String nombre;
    private double notaMateria;
   // private Alumno alumno;

        public Materia(){};
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

    public String MateriaEstudiante(){

       return getNombre() + " ("+ getNotaMateria() +")";
    }


}
