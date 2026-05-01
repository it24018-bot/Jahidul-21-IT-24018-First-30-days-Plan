import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Cow");
        map.put(2, "Cat");
        map.put(3, "DOg");

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}