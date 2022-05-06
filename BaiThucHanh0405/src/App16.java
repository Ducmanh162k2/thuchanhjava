import java.util.ArrayList;
import java.util.Scanner;

public class App16 {
    public static void main(String[] args) throws Exception {
        String a;
        ArrayList<String> arrListsString = new ArrayList<>();
        arrListsString.add("Nhat");
        arrListsString.add("cung");
        arrListsString.add("yeu");
        arrListsString.add("Lien");
        System.out.println("Các phẩn tử của mảng là: ");
        for (int i = 0; i < arrListsString.size(); i++) {
            System.out.print(arrListsString.get(i) + "\n");
        }
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vào phần tử cần xóa: ");
        j = scanner.nextInt();
        arrListsString.remove(j);
        System.out.println("các phần tử sau khi xóa là: ");
        for ( int t = 0 ; t < arrListsString.size(); t++) {
            System.out.print(arrListsString.get(t) + "\n");
        }
        int k;
        System.out.println("nhap vào vị trí cần thêm vào: ");
        k = scanner.nextInt();
        System.out.println("nhap vào giá trị cần thêm vào: ");
        a = scanner.nextLine();
        arrListsString.add(k, a);
        System.out.println("các phần tử sau khi thêm vào: ");
        for ( int t = 0 ; t < arrListsString.size(); t++) {
            System.out.print(arrListsString.get(t) + "\n");
        }
    }
}
