import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
	    public static void main(String[] args){
	    int n;
	    Scanner sc = new Scanner(System.in);
	    List<Integer> list = new ArrayList<Integer>();
	    System.out.println("Nhap so tu nhien: ");
	    n = sc.nextInt();
	    while (n != 0) {
	        list.add(n % 10);
	        n /= 10;
	    }
	    for(int i=0; i < list.size()-1;i++){
	        int temp = list.remove(list.size()-1);
	        list.add(i, temp);
	    }
	    for(int i=0; i < list.size()-1; i++){
	                if((list.get(i) != list.get(list.size()-1-i))){
	                    System.out.println("N khong la so thuan nghich");
	                    return;
	                }
	        }
	    System.out.println("N la so thuan nghich");
	    }
}