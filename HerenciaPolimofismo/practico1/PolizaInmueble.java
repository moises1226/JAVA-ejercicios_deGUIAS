package practico1;

public class PolizaInmueble {
    private int nroPoliza;
    private double incendio;
    private double robo;
    private boolean activa ;

    public PolizaInmueble(int np){
        this.nroPoliza = np;
    };

    public PolizaInmueble(int np , double incendio , double robo ){
        this.nroPoliza = np;
        this.incendio = incendio;
        this.robo = robo;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public double getIncendio() {
        return incendio;
    }

    public void setIncendio(double incendio) {
        this.incendio = incendio;
    }

    public double getRobo() {
        return robo;
    }

    public void setRobo(double robo) {
        this.robo = robo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
//-------------
    public void Activar(){


        this.activa = true;

    }

    public void Desactivar(){
        this.activa = false;
    }




}
