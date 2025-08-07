
package basic;
import java.util.*;

public class remove_dup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> n = new HashSet<>();
        for(int num : arr){
            n.add(num);
        }
        System.out.println(n);
        
    }
}
