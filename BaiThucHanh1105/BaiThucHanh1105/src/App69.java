import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> manh = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        manh.add(0);
        manh.add(3);
        manh.add(1);
        manh.add(4);
        manh.add(2);
        manh.add(8);

        System.out.println("Cac phan tu cos trong bai la: ");
        System.out.println(manh);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();
        if(!manh.contains(number)) {
            manh.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong manh sau khi them: ");
            System.out.println(manh);

        }else {
            System.out.println("Phan tu " + number + " da ton tai");
        }

    }
}
