package com.sm.model;

import java.util.List;

public class Curso  {

    private List<Alumno> alumnos;
    private List<Materia> materias;

    public  Curso(){};
    public Curso(List<Alumno> alum, List<Materia> mate){
        this.alumnos = alum;
        this.materias = mate;
    };
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    // Método para combinar nombres de alumnos y materias
    public void mostrarAlumnosYMaterias() {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            Materia materia = materias.get(i);
            System.out.println("Alumno: " + alumno.getNombre() + " Materia: " + materia.getNombre());
        }
    }


}


