import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        HashMap<Integer , String> hash  =new HashMap<>();

        hash.put(1000 ,"Juan");
        hash.put(3000 ,"Juan");
        hash.put(2000 ,"Juan");
        hash.put(4000 ,"Juan");

        hash.remove(2000);
        System.out.println(hash);

        if(hash.containsKey(300)){
            System.out.println("Dentro del hash existe el numero : " + hash.get(300));
        }else {
            System.out.println("No exite ese valor dentro del hash");
        }

        for(Integer  i  : hash.keySet()){
            System.out.println(hash.get(i));
        }


        }




    }

