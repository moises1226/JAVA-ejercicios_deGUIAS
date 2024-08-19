
public class main {
    public static void main(String[] args) {

        //una instancia es un objeto unico que contiene diferentes datos insertados
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);

        persona1.mostrarInfo();
        persona2.mostrarInfo();

        persona1.cambiarNombre("Moises");
        persona2.cambiarNombre("Aylen");
        persona1.cambiarEdad(-3);
        persona2.cambiarEdad(18);

        persona1.mostrarInfo();
        persona2.mostrarInfo();
    }
}

