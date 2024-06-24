package TitanesPasficio;

public class Kaiju  extends Habilidades {

    String nombre;
    String origen;
    String destino;
    String creador;
    double peso;
    String dureza;
    String energia;
    int vida;
    double tamanio;
    int categoria;


    Kaiju(String nombre, String origen, String destino, String creador,
          double peso, String dureza, String energia, int vida, double
          tamanio, int categoria, int DanioFisico, int DanioHabilidad,String NombreDanioFisico, String NombreDanioHabilidad) {

        super(DanioFisico, DanioHabilidad, NombreDanioFisico, NombreDanioHabilidad);

        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.creador = creador;
        this.peso = peso;
        this.dureza = dureza;
        this.energia = energia;
        this.vida = vida;
        this.tamanio = tamanio;
        this.categoria = categoria;


    }

    ;


    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }




}
