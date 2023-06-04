import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        arr.add(sc.nextInt());
        System.out.println("Nhap so thuc: ");
        arr.add(sc.nextFloat());
        System.out.println("Nhap gia tri boolean: ");
        arr.add(sc.nextBoolean());
        sc.nextLine();
        System.out.println("Nhap chuoi: ");
        arr.add(sc.nextLine());
      
        System.out.println(arr);
    }
}
