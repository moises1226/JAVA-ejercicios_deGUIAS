import com.sm.model.Alumno;
import com.sm.model.Curso;
import com.sm.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    public static void main(String[] args) {


        Alumno alumno1 = new Alumno("Moises", "Sopo", 94965605, 19, "m");
        Alumno alumno2 = new Alumno("Aylen", "Molina", 94965605, 18, "f");
        Alumno alumno3 = new Alumno("Astro", "Sopo", 94965605, 19, "m");
        Alumno alumno4 = new Alumno("Velicia", "Sopo", 94965605, 19, "f");
        Alumno alumno5 = new Alumno("Nelu", "Sopo", 94965605, 19, "f");

        Materia mat1 = new Materia("Matematica", 6);
        Materia mat2 = new Materia("Lengua ", 7);
        Materia mat3 = new Materia("Quimica", 5);
        Materia mat4 = new Materia("Ingles", 7);
        Materia mat5 = new Materia("Programacion", 9);

        List<Alumno> alum = new ArrayList<Alumno>();
        List<Materia> mate = new ArrayList<Materia>();
        alum.add(alumno1);
        alum.add(alumno2);
        alum.add(alumno3);
        alum.add(alumno4);
        alum.add(alumno5);
        mate.add(mat1);
        mate.add(mat2);
        mate.add(mat3);
        mate.add(mat4);
        mate.add(mat5);


        Curso curso = new Curso(alum, mate);

        curso.mostrarAlumnosYMaterias();
    }



    }



