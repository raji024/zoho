package conversions;
import java.util.*;
public class i_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String b ="";
        int temp = x;
        while(temp>0){
            int digit = temp%2;
            b = digit +b;
            temp = temp/2;

        }
        System.out.println(b);
    }
}
