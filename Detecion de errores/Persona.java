
public class Persona {
    private String nombre;
    private int edad;

    //El constructor cumple el rol de guardar los datos cuando crear instancias
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //este metodo cumple la funcion de mostrar toda la informacion de la instancia que creaste.
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // este metodo cumple la funcion de reescribir la edad que pusiste al crear la instancia
    // pero con una restriccion que indica que la edad solo debe permitirse a numeros positivos
    public void cambiarEdad(int nuevaEdad) {
        if (nuevaEdad <= 0) {

            System.out.println("La edad debe ser un valor positivo.");

        } else {
            edad = nuevaEdad;
        }
    }
    // este metodo cumple la funcion de reescribir el nombre  que pusiste al crear la instancia
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
}
