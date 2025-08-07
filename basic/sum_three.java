package basic;
import java.util.*;

public class sum_three {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int arr[] = new int[x];

       for(int i = 0; i < x; i++){
           arr[i] = sc.nextInt();
       }

       List<Integer> evenList = new ArrayList<>();
       List<Integer> oddList = new ArrayList<>();

       for(int i = 0; i < x; i++){
           if(i % 2 == 0){
               evenList.add(arr[i]);
           } else {
               oddList.add(arr[i]);
           }
       }

       // Sort evenList in descending order
       Collections.sort(evenList, Collections.reverseOrder());

       // Sort oddList in ascending order
       Collections.sort(oddList);

       int size = Math.max(evenList.size(), oddList.size());

       for(int i = 0; i < size; i++){
           if(i < evenList.size()){
               System.out.print(evenList.get(i) + " ");
           }
           if(i < oddList.size()){
               System.out.print(oddList.get(i) + " ");
           }
       }
   }
}
