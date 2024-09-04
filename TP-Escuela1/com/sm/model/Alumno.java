package com.sm.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Alumno{

    //HashMap<String, Integer> notas = new HashMap<String, Integer>();
    //notas..put("");
    private String nombre;
    private int dni;

    private String apellido;
    private int edad;
    private String sexo;

    private List<Materia> materias = new ArrayList<Materia>();
    public Alumno(){};
    public Alumno(String nombre , String apellido , int dni , int edad , String sexo){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Alumno(String nombre , String apellido , int dni , int edad , String sexo, List<Materia> materias){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String toString(){

        return  getNombre() + " " +getApellido();

    }


}
