

public class Kaiju  extends Habilidades {

    String nombre;
    String destino;
    double peso;
    String dureza;
    int vida;
    double tamanio;



    Kaiju(String nombre, String destino, double peso, String dureza, int energia, int vida, double tamanio,
          int danioFisico, int DanioHabilidad,String NombreDanioFisico, String NombreDanioHabilidad, int categoria) {

        super(energia, danioFisico, DanioHabilidad, NombreDanioFisico, NombreDanioHabilidad, categoria);

        this.nombre = nombre;
        this.destino = destino;
        this.peso = peso;
        this.dureza = dureza;
        this.vida = vida;
        this.tamanio = tamanio;



    }

    ;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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




}
