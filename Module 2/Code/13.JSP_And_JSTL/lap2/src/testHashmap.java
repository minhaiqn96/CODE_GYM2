import java.util.HashMap;
import java.util.Map;

public class testHashmap {
    private static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(1,"1");
        map.put(9,"2");
        map.put(3,"3");
        map.put(5,"4");
    }
    public static void main(String[] args) {
            System.out.println(map.keySet());
    }
}
