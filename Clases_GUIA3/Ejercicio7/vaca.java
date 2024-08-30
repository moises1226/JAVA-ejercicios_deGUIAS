package Ejercicio7;

public class vaca extends asbtrac_Animal{

    public vaca(String nombre , int patas , int edad , String color){
        super(nombre, patas, edad , color);
    }

    @Override
    public void Comer() {
        System.out.println("El" + getNombre() +" es comiendo");
    }

    @Override
    public void sonido() {

       System.out.println("El " + getNombre() + " dice MUUUUUUUU!");
    }
}
