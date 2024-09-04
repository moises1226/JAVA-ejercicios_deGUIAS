package com.sm.model;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Materia{

    private String nombre;
    private int dni;

    private String apellido;
    private int edad;
    private String sexo;


    public Alumno(){};
    public Alumno(String nombre , String apellido , int dni , int edad , String sexo){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;


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




    public String toString(){

        return  getNombre() + " " +getApellido();

    }


}
