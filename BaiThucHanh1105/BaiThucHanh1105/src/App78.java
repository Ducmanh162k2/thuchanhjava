import java.util.HashMap;
import java.util.TreeMap;
public class App78 {
    public static void main(String[] args) {
        HashMap<Integer, Float> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>(10);
        HashMap<Double, Double> map2 = new HashMap<>(4, 0.75f);
        HashMap<Float, Integer> map3 = new HashMap<>(new TreeMap<>());
    }
}