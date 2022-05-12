import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class App88 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("QNg","Quang Ngai");
        map.put("QN","Quang Nam");
        map.put("QN","Quang Ninh");
        map.put("HCM","Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho: ");
        Set<Map.Entry<String, String>> setCity = map.entrySet();
        System.out.println(setCity);
        System.out.println("QNg: " + map.get("QNg"));
        System.out.println("NT: " + map.get("NT"));
        if(map.containsValue("Thành Phố Hồ Chí Minh")){
            System.out.println("Có Thành phố Hồ Chính Minh trong map");
        }
    }
}
