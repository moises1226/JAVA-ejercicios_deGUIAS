import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Person_Test {

    @Test
    public void checkConstructorAndGetterMethods(){

        String name = "Aylen Molina";
        String address = "Av Olimpo";

        Person_ person = new Person_(name , address);

        assertEquals(name, person.name());
        assertEquals(name, person.address());

    }

    @Test
    public void checkEqualsMethod(){

        String name = "Moises Sopo";
        String address = "iguazu 1998";

        Person_ person1  = new Person_(name , address);
        Person_ person2  = new Person_(name , address);

        assertTrue(person1.equals(person2));
    }

    @Test
    public void checkHashCodeMethod(){

        String name = "Atro SM ";
        String address = "iguazu 1998";

        Person_ person1  = new Person_(name , address);
        Person_ person2  = new Person_(name , address);

        assertEquals(person1.hashCode(), person2.hashCode());
    }
    @Test
    public void checkToStringMethod(){

        String name = "Valecia SM ";
        String address = "iguazu 1998";

        Person_ person1  = new Person_(name , address);

        assertEquals("Persona : [name = Valecia SM , address=iguazu 1998]", person1.toString());
    }






}
