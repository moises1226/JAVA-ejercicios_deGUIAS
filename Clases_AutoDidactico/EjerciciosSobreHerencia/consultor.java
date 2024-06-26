package EjerciciosSobreHerencia;

public class consultor  extends Persona {

        String nombre_Consultora;
        int num_Consultor;



    public consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombre_Consultora , int num_Consultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_Consultora = nombre_Consultora;
        this.num_Consultor = num_Consultor;
    }


    public String getNombre_Consultora() {
        return nombre_Consultora;
    }

    public void setNombre_Consultora(String nombre_Consultora) {
        this.nombre_Consultora = nombre_Consultora;
    }

    public int getNum_Consultor() {
        return num_Consultor;
    }

    public void setNum_Consultor(int num_Consultor) {
        this.num_Consultor = num_Consultor;
    }

}
