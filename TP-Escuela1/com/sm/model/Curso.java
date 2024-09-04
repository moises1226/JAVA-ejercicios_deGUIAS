package com.sm.model;

import java.util.List;

public class Curso  {

    private List<Alumno> alumnos;
    private List<Materia> materias;
    private boolean bandera = false;

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

    //Método para combinar nombres de alumnos y materias
    public void mostrarAlumnosYMaterias() {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            Materia materia = materias.get(i);
            System.out.println("Alumno: " + alumno.getNombre() + " Materia: " + materia.getNombre());
        }
    }

    public void Estudiantes(){
        System.out.println("Alumnos:");
        for (int i = 0; i < alumnos.size() ; i++) {
            Alumno a = alumnos.get(i);
            Materia m = materias.get(i);
            System.out.println("Nombre: " + a.getNombre());
        }
    }

    public void mostrarMateriaEstudiante(String nombre){
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alum = alumnos.get(i);
            Materia mat = materias.get(i);
            if (nombre.equals(alum.getNombre())){
                System.out.println("Alumno: " + alum.getNombre() + " Materia: " + mat.getNombre());
                bandera = true;
                break;
            }
        }
        if (!bandera){
            System.out.println("El alumno no  se encuentra en el curso");
        }
    }



}


