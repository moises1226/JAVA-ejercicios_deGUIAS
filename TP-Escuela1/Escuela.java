import com.sm.model.Alumno;
import com.sm.model.Curso;
import com.sm.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    public static void main(String[] args) {

        Materia mat1 = new Materia("Matematica", 6);
        Materia mat2 = new Materia("Lengua ", 7);
        Materia mat3 = new Materia("Quimica", 5);
        Materia mat4 = new Materia("Ingles", 7);
        Materia mat5 = new Materia("Programacion", 9);

        List<Materia> materiasMoises = new ArrayList <Materia>();
        List<Materia> materiasAylen = new ArrayList <Materia>();

        materiasMoises.add(mat1);
        materiasMoises.add(mat2);
        materiasMoises.add(mat3);
        materiasMoises.add(mat4);
        materiasMoises.add(mat5);

        materiasAylen.add(new Materia("Lengua", 9));
        materiasAylen.add(new Materia("Mate", 9));
        materiasAylen.add(new Materia("Quimica", 9));
        materiasAylen.add(new Materia("Historia", 9));
        materiasAylen.add(new Materia("Redes", 9));

        Alumno moises = new Alumno("Moises", "Sopo", 94965605, 19, "m",materiasMoises);
        Alumno aylen = new Alumno("Aylen", "Molina", 94965605, 18, "f" , materiasAylen);

        List<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(moises);
        alumnos.add(aylen);




        /*System.out.println("Materias " + moises.getApellido() + ": ");

        for (Materia materia : materiasMoises)
        {
            System.out.println(materia.getNombre());

        }*/
        Curso curso = new Curso(alumnos);

        List<Curso> cursos = new ArrayList<>();

        cursos.add(curso);

        /*Imprimir todas las materiasMoises de todos los alumnos*/

        for (Materia m : materiasMoises){
            System.out.println("Las materias de Moises son: " + m.getNombre());
        }

        System.out.println("---");
        System.out.println("Todas las materias de todos los alumnos ");

        for (int i = 0; i < alumnos.size(); i++){

            System.out.println("");
            for (int j = 0; j < alumnos.get(i).getMaterias().size(); j++) {
                System.out.println(alumnos.get(i).getMaterias().get(j).getNombre());
            }

        }

        /*
        String nombreAlumno = "Moises";

        for (Curso c : cursos){
            for (Alumno a : c.getAlumnos()){
                //if(a.getNombre().equals(nombreAlumno) ){

                    System.out.println("Imprimiendo las materiasMoises de: " + a.getNombre());

                    for (Materia m : a.getMaterias()){
                        System.out.println(m.getNombre());
                    }
                //}
            }
        }
        */

        }


    }





