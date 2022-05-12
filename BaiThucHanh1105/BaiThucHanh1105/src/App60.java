import java.util.LinkedHashSet;
import java.util.Set;

public class App60 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Java");
        set.add("C++");
        set.add("Java");
        set.add("PHP");
        for (String str : set) {
            System.out.println(str);
        }
    }    
}
