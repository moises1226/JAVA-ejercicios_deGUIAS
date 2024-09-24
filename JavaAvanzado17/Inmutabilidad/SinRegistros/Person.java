import java.util.Objects;

public class Person {

    private final String name;
    private final String address;

    public Person (String name , String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    };
    
    @Override
    public int hashCode(){
        return Objects.hash(name , address);
    }

    @Override
    public boolean equals(Object obj ){
        if(this == obj){
            return true;
        } else if (!(obj instanceof Person_)) {
            return false;
        }else{

            Person otro = (Person) obj;
            return Objects.equals(name, otro.name) && Objects.equals(address , otro.address);

        }

    }

    @Override
    public String toString() {
        return "Person [name = "+ name + " , address = " + address  + "]";
    }
}
