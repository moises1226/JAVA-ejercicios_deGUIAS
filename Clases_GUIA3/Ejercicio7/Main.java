package Ejercicio7;

public class Main {

    public static void main(String[] args) {

        gato gato1 = new gato("Bolt" , 4 , 3 , "naranja");
        vaca vaca1 = new vaca("mumu" , 4 , 9 , "negro y blaco");

        gato1.Comer();
        gato1.sonido();
        vaca1.sonido();

    }

}

