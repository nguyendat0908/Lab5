import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Float> hs = new HashSet<Float>();
        Map<Integer, Float> map = new HashMap<Integer, Float>();
        int n;
        System.out.println("Nhap n:");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap x["+(i+1)+"]: ");
            float temp = sc.nextFloat();
            if(hs.contains(temp) == false ) hs.add(temp);
            else hs.remove(temp);
        }
        int i=0;
        for (Float temp : hs) {
            map.put((n-i),temp);
            i++;
        }
        System.out.println("DS SET: ");
        System.out.println(hs);
        System.out.println("DS MAP: ");
        for (java.util.Map.Entry<Integer, Float> me : map.entrySet()) {
            System.out.print(me.getValue()+"\t");
        }
    }
}
