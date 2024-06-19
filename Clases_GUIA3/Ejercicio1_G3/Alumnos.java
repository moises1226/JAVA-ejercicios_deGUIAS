package Ejercicio1_G3;/*
Ejercicio 1
Crear una clase llamada Alumnos que tenga:
Como atributos Nombre, Edad, DNI privados
Constructor que permita al usuario inicializar los datos al generar una instancia
Setters y Getters para modificar los atributos
Método que muestre “El alumno X con DNI X tiene X años”, siendo X los atributos creados.
        Luego, en una clase Escuela, generar 2 instancias(con datos iniciales que decidan) de Alumnos para:
Ver su información completa
Modificar sus edades
Ver nuevamente la información, actualizada
*/

 public class Alumnos {

     private String nombre;
     private int edad;
     private int dni;

     public Alumnos(String nombre , int edad , int dni){

         this.nombre = nombre;
         this.edad = edad;
         this.dni = dni;
         this.setnombre(nombre);
         this.setEdad(edad);
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




 }