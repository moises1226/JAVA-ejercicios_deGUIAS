package TitanesPasifico;

public class Habilidades {

    int DanioFisico;
    int DanioHabilidad;
    String NombreDanioFisico;
    String NombreDanioHabilidad;


    public Habilidades(int danioFisico, int DanioHabilidad, String NombreDanioFisico, String NombreDanioHabilidad ) {
        this.DanioFisico = danioFisico;
        this.DanioHabilidad = DanioHabilidad;
        this.NombreDanioFisico = NombreDanioFisico;
        this.NombreDanioHabilidad = NombreDanioHabilidad;
    }

    public int getDanioFisico(){
        return DanioFisico;
    }
    public void setDanioFisico(int DanioFisico){
        this.DanioFisico = DanioFisico;
    }

    public int getDanioHabilidad(){
        return DanioHabilidad;
    }
    public void setDanioHabilidad(int DanioHabilidad){
        this.DanioHabilidad = DanioHabilidad;
    }

    public String getNombreDanioFisico(){
        return NombreDanioFisico;
    }
    public void setNombreDanioFisico(String  NombreDanioFisico){
        this.NombreDanioFisico = NombreDanioFisico;
    }

    public String getNombreDanioHabilidad(){
        return NombreDanioHabilidad;
    }
    public void setNombreDanioHabilidad(String NombreDanioFisico){
        this.NombreDanioFisico = NombreDanioFisico;
    }
}


