import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> flatOwner = new HashMap<>();
        flatOwner.put(11,"Viktor");
        flatOwner.put(12,"Max");
        flatOwner.put(13,"Maria");
        flatOwner.put(14,"Felix");
        flatOwner.put(15,"Hektor");

        HashSet<Integer> keys = new HashSet<>();
        keys.add(13);
        keys.add(13);

        System.out.println(keys);

        System.out.println(flatOwner);
    }


}
