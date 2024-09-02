import com.sm.model.Alumno;
import com.sm.model.Curso;
import com.sm.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Alumno alumno1 = new Alumno("Moises" , "Sopo" , 94965605 , 19 , "m" , 8);
        Alumno alumno2 = new Alumno("Aylen" , "Molina" , 94965605 , 18 , "f" , 10);
        Alumno alumno3 = new Alumno("Astro" , "Sopo" , 94965605 , 19 , "m" , 8);
        Alumno alumno4 = new Alumno("Velicia" , "Sopo" , 94965605 , 19 , "f" , 8);
        Alumno alumno5 = new Alumno("Nelu" , "Sopo" , 94965605 , 19 , "f" , 8);

        List<Alumno> alum = new ArrayList<Alumno>();

        alum.add(alumno1);
        alum.add(alumno2);
        alum.add(alumno3);
        alum.add(alumno4);
        alum.add(alumno5);

        Materia alu1 = new Materia("Matematica" , 8.4);
        Materia alu2 = new Materia("Lengua" , 7);
        Materia alu3 = new Materia("Quimica" , 7.5);
        Materia alu4 = new Materia("Historia" , 6);
        Materia alu5 = new Materia("Programacion" , 9);

        Curso cursoA = new Curso(alumno1 , alu1);
        Curso cursoB = new Curso(alumno2 , alu2);
        Curso cursoC = new Curso(alumno3  , alu3);
        Curso cursoD = new Curso(alumno4 , alu4);
        Curso cursoE = new Curso(alumno5 , alu5);


        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(cursoA);
        cursos.add(cursoB);
        cursos.add(cursoC);
        cursos.add(cursoD);
        cursos.add(cursoE);


        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(cursos.get(i).All_MateriaEstudiante());
        }




        }



    }



