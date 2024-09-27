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

    public void InvasiónCerditos(int cantidadCerditos , List<Pajaros> grupoPájaros){

        if (cantidadCerditos >= 100){

        }

    }

}
