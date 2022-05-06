import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("C++");
        list.add("PHD");
        list.add("Java");

        System.out.println("ví dụ sử dung phuong thuc addALL()");
        System.out.println("--------------------");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA: ");
    }    
}
