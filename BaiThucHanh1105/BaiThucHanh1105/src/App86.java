import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class App86 {
    
    public static void main(String[] args){
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("CSDL", "Co so du lieu");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong set: ");
        System.out.println(setHashMap);
    }
}
