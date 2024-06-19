//juego con personajes de anime

public class Personajes {

    //ponemos los atributos que quiero q tenga cada personaje.
    public String nombre ;
    public int salud;
    public String nombreAtaqueBasico;
    public int  danoAB;
    private String nombreHablidad;
    private int danoHab;


   /*
    usamos a funcion contrucctor
    este constructor solo nos va aplicar los datos ya aplicacos a cada objeto diferente, en pocas palabras cada objeto va atener el mismo dato

      public Personajes(){

        this.nombre = "Goku";
        this.salud = 250;
        this.nombreAtaqueBasico = "puños";
        this.danoAC = 27;
        this.nombreHablidad = "kamekameha";
        this.danoHAb = 39;


    }; */

        //este seria la mojor forma de crear un construcutor

    public Personajes(String nombre, int salud, String nombreAB,int danoAB , String nombreHab, int danoHab ) {

        this.setNombre(nombre);
        this.setSalud(salud);
        this.setNombreAtaqueBasico(nombreAB);
        this.setDanoAB(danoAB);
        this.setNombreHabilidad(nombreHab);
        this.setDanoHab(danoHab);

    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }
     public void setSalud(int salud) {

            this.salud = salud;
    }
    public String getNombreAtaqueBasico() {
        return nombreAtaqueBasico;
    }
    public void setNombreAtaqueBasico(String nombreAB) {
        this.nombreAtaqueBasico = nombreAB;
    }
    public int getDanoAB() {
        return danoAB;
    }
    public void setDanoAB(int danoAB) {
        this.danoAB = danoAB;
    }
    public String getNombreHablidad() {
        return nombreHablidad;
    }
    public void setNombreHabilidad(String nombreHab){

        this.nombreHablidad = nombreHab;
    }
    public int getDanoHab(){

        return danoHab;
    }
    public void setDanoHab(int danoHab){

        this.danoHab = danoHab;
    }




    //creamos un metodo de vida
    public void verVida(){

        System.out.println("Le queda " + this.salud + " de vida");

    }
    //creamos un metodo donde se le baja la vida
    public void restarVida(int dano){

            this.salud -= dano;

    }

    public void NombreHablidad() {

        System.out.println("Habilidad: " + this.nombreHablidad);

    }
    public void danoHabilidad() {

        System.out.println("Su daño de habilidad es: " + this.danoHab);

    }
}
