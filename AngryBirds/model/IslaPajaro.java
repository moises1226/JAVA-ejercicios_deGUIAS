package model;

import java.util.List;

public class IslaPajaro {


    public IslaPajaro() {
    }

    public void manejoDeIra(List<Pajaros> pajaros){

        for(Pajaros p : pajaros){
            String nombre = p.getNombre();
            double ira = p.getIra();
            if (!(nombre.equals("Chuck"))){
               p.setIra(ira - 5);
               p.FuerzaDePajaro();
            }

        }

    }

    public void InvasionCerditos(int cantidadCerditos , List<Pajaros> grupoPajaros){


        int vecesEnojo = cantidadCerditos / 100;

        if (vecesEnojo > 0) {
            for (Pajaros p : grupoPajaros) {
                int enojoActual = p.getEnojo();
                p.setEnojo(enojoActual + vecesEnojo); // Aumentar el enojo
                p.FuerzaDePajaro();
            }
            System.out.println("Los pájaros se han enojado " + vecesEnojo + " veces debido a la invasión de " + cantidadCerditos + " cerditos.");
        } else {
            System.out.println("La cantidad de cerditos no es suficiente para enojar a los pájaros.");

        }

    }


    public void FiestaSorpresa (){}




}
