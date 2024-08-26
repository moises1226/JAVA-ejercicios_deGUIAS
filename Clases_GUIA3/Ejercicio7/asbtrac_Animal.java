package Ejercicio7;

abstract class asbtrac_Animal {

    private String nombre;
    private int patas;
    private  int edad;
    private  String color;

    public asbtrac_Animal(String nombre, int patas, int edad , String color ) {

        this.nombre = nombre;
        this.patas = patas;
        this.edad = edad;
        this.color = color;

    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract void Comer();
    public  abstract  void  sonido ();


    
}
