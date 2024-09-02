import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        //Guardaremos objetos de tipo Persona dentro de una List<>

        List<Persona_> lista = new ArrayList<Persona_>();
        //metodo de agregación a la lista

        //creamos el objeto
        Persona_ perso1 = new Persona_(1 , "Moises", 19);
        Persona_ perso2 = new Persona_(2 , "Astro", 14);
        Persona_ perso3 = new Persona_(3 , "Aylén", 18);
        Persona_ perso4 = new Persona_(4 , "Dicel", 15);
        Persona_ perso5 = new Persona_(5 , "Vanesa", 17);
        Persona_ perso6 = new Persona_(6 , "Nole" , 14);

        //si tenemos un objeto persona creado, podemos crear un objeto dentro de add().
        lista.add(perso1);
        lista.add(perso2);
        lista.add(perso3);
        lista.add(perso4);
        lista.add(perso5);
        lista.add(perso6);

        //recorre la lista
        // para el tamaño se usa size() en vez de length
        System.out.println("----------FOR---------------");
        for (int i = 0; i < lista.size(); i++) {
                System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        System.out.println("----------FOREACH---------------");
        //uso de foreach
        //Por cada objeto persona que este dentro de lista --se lee asi
        for (Persona_ perso : lista){
            System.out.println("Prueba : " + perso.getNombre());
        }

    }

}
