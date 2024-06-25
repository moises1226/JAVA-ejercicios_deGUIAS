package TitanesPasifico;

public class Jaegar {
    String modelo;
    String NroPiloto;
    Boolean esNuclear;
    String nombre;

    Jaegar(String modelo, String NroPiloto, Boolean esNuclear) {
        this.modelo = modelo;
        this.NroPiloto = NroPiloto;
        this.esNuclear = esNuclear;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getNroPiloto() {
        return NroPiloto;
    }

    public void setNroPiloto(String piloto) {
        this.NroPiloto  = piloto;
    }


    public Boolean getEsNuclear() {
        return esNuclear;
    }

    public void setEsNuclear(Boolean esNuclear) {
        this.esNuclear = esNuclear;
    }
}