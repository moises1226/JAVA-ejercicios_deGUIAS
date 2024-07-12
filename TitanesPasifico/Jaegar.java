
public class Jaegar extends Habilidades {
    String modelo;
    int NroPiloto;
    Boolean esNuclear;
    String nombre;

    public Jaegar(String modelo, String nombre,int NroPiloto, Boolean esNuclear, int DanoFisico, int DanoHabilidad, String NombreDanioFisico, String NombreDanioHabilidad){
        super(DanoFisico, DanoHabilidad, NombreDanioFisico, NombreDanioHabilidad);

        this.modelo = modelo;
        this.nombre = nombre;
        this.NroPiloto = NroPiloto;
        this.esNuclear = esNuclear;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNroPiloto() {
        return NroPiloto;
    }

    public void setNroPiloto(int piloto) {
        this.NroPiloto  = piloto;
    }


    public Boolean getEsNuclear() {
        return esNuclear;
    }

    public void setEsNuclear(Boolean esNuclear) {
        this.esNuclear = esNuclear;
    }




}