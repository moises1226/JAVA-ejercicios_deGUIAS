import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


            // Creación de objetos Person
            Person person1 = new Person("Moises", "123 Main St");
            Person person2 = new Person("Moises", "123 Main St");
            Person person3 = new Person("Bob", "456 Elm St");

            // Uso de equals()
            System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
            System.out.println("person1.equals(person3): " + person1.equals(person3)); // false

            // Uso de hashCode()
            HashSet<Person> personSet = new HashSet<>();
            personSet.add(person1);
            personSet.add(person2); // No se agrega, ya que es igual a person1
            personSet.add(person3);

            // Uso de toString()
            System.out.println("Person set contents:");
            for (Person p : personSet) {
                System.out.println(p); // Imprime los detalles de cada Person
            }

            HashMap<Person, String> personMap = new HashMap<>();

            // Agregar person1 al HashMap
            personMap.put(person1, "Desarrolladora");

            // Agregar person2 al HashMap
            personMap.put(person2, "Diseñadora"); // Esto no se agrega porque es igual a person1

            // Agregar person3 al HashMap
            personMap.put(person3, "Gerente");

            // Imprimir el contenido del HashMap
            System.out.println("Contenido del HashMap:");
            for (Person p : personMap.keySet()) {
                System.out.println(p + " - " + personMap.get(p));
            }

            // Verificar si person1 y person2 son iguales
            System.out.println("¿person1 es igual a person2? " + person1.equals(person2)); // true
            System.out.println("¿person1 es igual a person3? " + person1.equals(person3)); // false
    }



    }
