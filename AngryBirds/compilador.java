import model.Pajaros;

import java.util.ArrayList;
import java.util.List;

public class compilador {

    public static void main(String[] args) {


        Pajaros pajaro1 = new Pajaros("Red" , 15.5  , 20 , 80);
        Pajaros pajaro2 = new Pajaros("comun" , 15.5  , 20 , 80);
        Pajaros pajaro3= new Pajaros("Terence" , 15.5  , 20 , 80);

        pajaro1.EnojarPajaro(5);
        pajaro1.FuerzaDePajaro();
        pajaro2.EnojarPajaro(2);
        pajaro2.FuerzaDePajaro();
        pajaro3.EnojarPajaro(3);
        pajaro3.FuerzaDePajaro();


        List<Pajaros> GrupoDePajaros = new ArrayList<>();
        GrupoDePajaros.add(pajaro1);
        GrupoDePajaros.add(pajaro2);
        GrupoDePajaros.add(pajaro3);

        double fuezaTotal = 0;

        for (Pajaros p : GrupoDePajaros){

            double fuerzaTotal = p.getFuerza();
            fuezaTotal = fuezaTotal + fuerzaTotal;
        }

        System.out.println("La fuerza total del los pájaros es: " + fuezaTotal);



    }

}
