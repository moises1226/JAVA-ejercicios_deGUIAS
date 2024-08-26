package Ejercicio7;

public class gato extends asbtrac_Animal {

        public gato(String nombre , int patas , int edad , String color){
            super(nombre , patas, edad, color);
        }

    @Override
    public void Comer() {
        System.out.println(getNombre() + " esta comiendo");
    }

    @Override
    public void sonido(){
            System.out.println("El " + getNombre() + " dice MIAUUUUUU!!");
    }
}
