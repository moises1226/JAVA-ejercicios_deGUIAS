package com.sm.model;

import java.util.List;

public class Curso  {

    private Alumno alumno;
    private Materia materia;

    public  Curso(){};
    public Curso(Alumno alumno, Materia materia){
        this.alumno = alumno;
        this.materia = materia;
    };



    public String All_NotasMateria(){
        return "Curso : " + materia + " Alumno: " + alumno;
    }

    public String All_MateriaEstudiante(){

        return "Materia: " + materia.getNombre() + " Alumno: " + alumno.getNombre();
    }

    public String NotaEstudiante( String nombre) {

        String s = "Nombre: " + alumno.getNombre() + materia.getNombre() + materia.getNotaMateria();

        return s;




    }


}


