package H_Ppart1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> materias = new ArrayList<String>();
        List<String> materias2 = new ArrayList<String>();
        List<String> materias3 = new ArrayList<String>();
        List<String> materias4 = new ArrayList<String>();
        materias.add("Matematica");
        materias.add("Lengua");
        materias.add("Quimica");
        materias2.add("Sivica");
        materias2.add("Matematica II");
        materias2.add("Administracion");
        materias3.add("Ingles");
        materias3.add("Redes");
        materias3.add("Quimica");
        materias4.add("Programacion");
        materias4.add("Historia");
        materias4.add("Sociales");
        
        
        Alumno alu1 = new Alumno ("Moises" , "Sopo" , 19 , materias);
        Alumno alu2 = new Alumno ("Aylen" , "Molina" , 19 , materias2);
        Alumno alu3 = new Alumno ("Astro" , "Sopo" , 19 , materias3);
        Alumno alu4 = new Alumno ("Dema" , "Molina" , 19 , materias4);

        List<Alumno> alumnos = new ArrayList<Alumno>();
        
        Alumno a = new Alumno();

        a.EdadEstudiantes(alumnos);
        
       




    }
}
