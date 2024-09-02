package practico1;

public class PolizaInmuebleEscolar  extends PolizaInmueble {

    private int cantAlumno;
    private int cantDocente;
    private int polAlumno;
    private int polDocente;

    public PolizaInmuebleEscolar(int np) {
        super(np);
    }

    public PolizaInmuebleEscolar(int np , double incendio , double robo , int cantAlumno , int canDocente , int polAlumno , int polDocente){
        super( np ,  incendio ,  robo);

        this.cantDocente = canDocente;
        this.cantAlumno = cantAlumno;
        this.polAlumno = polAlumno;
        this.polDocente = polDocente;
    }

    public int getCantAlumno() {
        return cantAlumno;
    }

    public void setCantAlumno(int cantAlumno) {
        this.cantAlumno = cantAlumno;
    }

    public int getCantDocente() {
        return cantDocente;
    }

    public void setCantDocente(int cantDocente) {
        this.cantDocente = cantDocente;
    }

    public int getPolAlumno() {
        return polAlumno;
    }

    public void setPolAlumno(int polAlumno) {
        this.polAlumno = polAlumno;
    }

    public int getPolDocente() {
        return polDocente;
    }

    public void setPolDocente(int polDocente) {
        this.polDocente = polDocente;
    }




    public double obtenerCostPoliza(){

        double poliza = getIncendio() + getRobo();

        return (poliza + (getPolDocente()*getCantDocente()) + (getPolAlumno()*getCantAlumno()));

    }









}
