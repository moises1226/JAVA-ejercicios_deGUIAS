import model.IslaPajaro;
import model.Pajaros;

import java.util.ArrayList;
import java.util.List;

public class compilador {

    public static void main(String[] args) {


        IslaPajaro islaPajaro = new IslaPajaro();

        Pajaros pajaro1 = new Pajaros("Red" , 15.5  , 40 , 80);
        Pajaros pajaro2 = new Pajaros("comun" , 15.5  , 40 , 80);
        Pajaros pajaro3= new Pajaros("Terence" , 15.5  , 40 , 80);


        pajaro1.EnojarPajaro(5);
        pajaro1.FuerzaDePajaro();
        pajaro2.EnojarPajaro(2);
        pajaro2.FuerzaDePajaro();
        pajaro3.EnojarPajaro(3);
        pajaro1.FuerzaDePajaro();

        System.out.println("----------------------------");


        System.out.println(pajaro1.getIra());
        System.out.println(pajaro2.getIra());
        System.out.println(pajaro3.getIra());


        List<Pajaros> GrupoDePajaros = new ArrayList<>();

        GrupoDePajaros.add(pajaro1);
        GrupoDePajaros.add(pajaro2);
        GrupoDePajaros.add(pajaro3);

        islaPajaro.manejoDeIra(GrupoDePajaros);



        System.out.println("--------------------------------");
        System.out.println(pajaro1.getIra());
        System.out.println(pajaro2.getIra());
        System.out.println(pajaro3.getIra());

        System.out.println("--------------------------------");
        Pajaros gruposP = new Pajaros();
        gruposP.FuerzaTotal(GrupoDePajaros);

    }

}
