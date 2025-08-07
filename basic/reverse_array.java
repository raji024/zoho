package basic;
import java.util.*;

public class reverse_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Integer arr[] = new Integer[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
