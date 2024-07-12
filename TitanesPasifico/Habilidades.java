import java.util.Random;

public class Habilidades {

    private int DanioFisico;
    private int DanioHabilidad;
    private String NombreDanioFisico;
    private String NombreDanioHabilidad_K;
    private String NombreDanioHabilidad_J;
    private int Categoria;
    private int energia;



    public Habilidades(int energia , int DanioFisico, int DanioHabilidad, String NombreDanioFisico, String NombreDanioHabilidad_K, int categoria  ) {

        if(categoria > 5){

            throw new IllegalArgumentException("Categoria no valido");

        }

        this.DanioFisico = DanioFisico;
        this.DanioHabilidad = DanioHabilidad;
        this.NombreDanioFisico = NombreDanioFisico;
        this.NombreDanioHabilidad_K = NombreDanioHabilidad_K;

        this.energia = energia;
    }

    public Habilidades(int danioFisico, int danoHabilidad, String nombreDanioFisico, String nombreDanioHabilidad_J) {
        this.DanioFisico = danioFisico;
        this.DanioHabilidad = danoHabilidad;
        this.NombreDanioFisico = nombreDanioFisico;
        this.NombreDanioHabilidad_J = nombreDanioHabilidad_J;
    }

    public int getEnergia(){
        return energia;
    }
    public void setEnergia(int energia){
        this.energia = energia;
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

    public String getNombreDanioHabilidad_K(){
        return HabilidadEspecialidadRamdom();
    }
    public void setNombreDanioHabilidad_K(String NombreDanioHabilidad_K){
        this.NombreDanioHabilidad_K = NombreDanioHabilidad_K;
    }

    public String getNombreDanioHabilidad_J(){
        return NombreDanioHabilidad_J;
    }
    public void setNombreDanioHabilidad_J(String NombreDanioHabilidad_J){
        this.NombreDanioHabilidad_J = NombreDanioHabilidad_J;
    }


    public int getCategoria(){
        return Categoria;
    }
    public void setCategoria(int Categoria){

        if(Categoria > 5){

            throw new IllegalArgumentException("Categoria no valido");

        }else{

            this.Categoria = Categoria;
        }
    }


    public String HabilidadEspecialidadRamdom(){

        String [] habilidadEspecial = {"Inmune al Fuego", "Emitir Rayo de Plasma", "Pulso electromagnetico"};

        return habilidadEspecial[new Random().nextInt(habilidadEspecial.length)];

    };

    public int PoderDePelea(){


        int poderPelea = getEnergia() + getDanioHabilidad();

        return poderPelea;
    }

    public String GanarOPerder(Jaegar peleador1, Kaiju peleador2){

        String ganador;

        if(peleador1.PoderDePelea() > peleador2.PoderDePelea()){

            ganador = peleador1.getNombre();

            return ganador;

        }else{

            ganador = peleador2.getNombre();

            return ganador;

        }


    };

}


