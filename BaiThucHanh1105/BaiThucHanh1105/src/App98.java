import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;

public class App98 {
    public static void main(String[] args){
        TreeMap<String, Double> treeMap = new TreeMap<>();
        Map<Float, Integer> map = new HashMap<>();
        TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
    }
}
