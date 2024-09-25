import java.util.Objects;

public record Person_(String name , String address) {

        public static String UNKNOWN_ADDRESS = "Unknown";
    public static String UNKNOWN_NAME = "Unknown";

        public Person_ {
            Objects.requireNonNull(name);
            Objects.requireNonNull(address);
        }
//
//        public Person_ (String name , String address){
//            Objects.requireNonNull(name);
//            Objects.requireNonNull(address);
//            this.name = name;
//            this.address = address;
//        }

        public Person_ (String name){
            this(name , UNKNOWN_ADDRESS);
        }
        public static Person_ ads(String address){
         return  new Person_(address , UNKNOWN_NAME);
        }


}
