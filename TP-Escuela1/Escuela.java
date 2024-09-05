import com.sm.model.Alumno;
import com.sm.model.Curso;
import com.sm.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    public static void main(String[] args) {

        Materia mat1 = new Materia("Matematica", 6);
        Materia mat2 = new Materia("Lengua", 7);
        Materia mat3 = new Materia("Quimica", 5);
        Materia mat4 = new Materia("Ingles", 7);
        Materia mat5 = new Materia("Astronomia", 9);

        List<Materia> materiasMoises = new ArrayList <Materia>();
        List<Materia> materiasAylen = new ArrayList <Materia>();

        materiasMoises.add(mat1);
        materiasMoises.add(mat2);
        materiasMoises.add(mat3);
        materiasMoises.add(mat4);
        materiasMoises.add(mat5);

        materiasAylen.add(new Materia("Lengua", 9));
        materiasAylen.add(new Materia("Matematica", 9));
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
        Curso cursoA = new Curso(alumnos);

        List<Curso> cursos = new ArrayList<>();

        cursos.add(cursoA);

        /*Imprimir todas las materias de todos los alumnos*/

        System.out.println("---");
        System.out.println("Todas las materias de todos los alumnos ");

        for (int i = 0; i < alumnos.size(); i++){

            System.out.println(alumnos.get(i).getNombre());
            for (int j = 0; j < alumnos.get(i).getMaterias().size(); j++) {
                System.out.println(alumnos.get(i).getMaterias().get(j).getNombre());

            }
            System.out.println("----------------------------");
        }

        //imprimir los estudiantes de un cursoA.
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Los estudiante del cursoA son: " );
            for (int j = 0; j < cursos.get(i).getAlumnos().size() ; j++) {
                System.out.println(cursos.get(i).getAlumnos().get(j).getNombre());
            }
        }

        ///-----------------------------------------
        //Notas de estudiante de una materia
        String nombre = "Moises";
        String materia = "Quimica";
        System.out.println("---------------------------------------");
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.get(i).getMaterias().size() ; j++)
                if (nombre.equals(alumnos.get(i).getNombre()) && materia.equals(alumnos.get(i).getMaterias().get(j).getNombre())) {
                    System.out.println("Nota:");
                    System.out.println("Alumno: " + alumnos.get(i).getNombre() + "\n"
                            + "Materia: " + alumnos.get(i).getMaterias().get(j).getNombre() + " Nota: " + alumnos.get(i).getMaterias().get(j).getNotaMateria());
                }
        }
        //----------------------------------------------------
        //todas las notas de un estudiante
        System.out.println("---------------------------------------------");
        System.out.println("Todas las notas de " + nombre + " son: ");
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.get(i).getMaterias().size() ; j++) {

                if (nombre.equals(alumnos.get(i).getNombre())) {
                    System.out.println("Notas:\n" + alumnos.get(i).getMaterias().get(j).getNotaMateria() + " --> "
                            + alumnos.get(i).getMaterias().get(j).getNombre());
                }
            }
        }
        //----------------------------------------------------------------
        //Las materias que esta anotado un estudiante
        System.out.println("------------------------------------------------");
        System.out.println("El alumno " + nombre + " esta anotado en las materias de: ");
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.get(i).getMaterias().size() ; j++) {
                if (nombre.equals(alumnos.get(i).getNombre())){
                    System.out.println(alumnos.get(i).getMaterias().get(j).getNombre() );
                }
            }
        }





    }
        }







