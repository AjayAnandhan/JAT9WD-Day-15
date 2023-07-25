package Tasks;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        TreeMap<Integer, String> obj1 = new TreeMap<>();

        obj1.put(1, "Raja");
        obj1.put(2, "Ajay");
        obj1.put(3, "Rajesh");
        obj1.put(4, "Vennila");
        obj1.put(5, "Santhosh");

        List<String> obj2 = new ArrayList<>(obj1.values());

        Collections.sort(obj2);
        for(String a : obj2) {
        	System.out.println(a);
        }
    }
}