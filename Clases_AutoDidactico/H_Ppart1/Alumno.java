package H_Ppart1;

import java.util.List;

public class Alumno {

    private String nombre;
    private String apellido;
    private int anio;
    private List<String> materias;

    public Alumno(List<String> materias, int anio, String apellido, String nombre) {
        this.materias = materias;
        this.anio = anio;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;

    }

    public void EdadEstudiantes (){}
}

