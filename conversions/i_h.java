package conversions;
import java.util.*;
public class i_h {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        HashMap<Integer,Character> n = new HashMap<>();
        n.put(0,'0');
        n.put(1,'1');
        n.put(2,'2');
        n.put(3,'3');
        n.put(4,'4');       
        n.put(5,'5');
        n.put(6,'6');
        n.put(7,'7');       
        n.put(8,'8');
        n.put(9,'9');
        n.put(10,'A');
        n.put(11,'B');
        n.put(12,'C');
        n.put(13,'D');
        n.put(14,'E');
        n.put(15,'F');
        String b ="";
        int temp = x;
        while(temp>0){
            int digit = temp%16;
            b = n.get(digit) + b;
            temp = temp/16;
        }
        System.out.println(b);

    }
}
