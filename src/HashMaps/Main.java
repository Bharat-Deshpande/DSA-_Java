package HashMaps;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        String name = "Bharat";
//        int code = name.hashCode();
//        System.out.println(code);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 89);
        map.put("Bharat", 99);
        map.put("Rahul", 87);

//        System.out.println(map.get("Kunal"));
//        System.out.println(map.containsKey("Bharat"));


        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(45);
        set.add(42);
        System.out.println(set);
    }


}
