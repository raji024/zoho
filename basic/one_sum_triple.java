package basic;
import java.util.*;
public class one_sum_triple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        boolean isfound = false;
        int k = sc.nextInt();
        for(int p=0;p<x-2;p++){
            for(int q=p+1;q<x-1;q++){
                for(int r=q+1;q<x;r++){
                    if(arr[p]+arr[q]+arr[r]==k){
                        System.out.println(arr[p]+" "+arr[q]+" "+arr[q]);
                        isfound = true;
                        break;
                    }
                    isfound = true;
                    break;
                }
                isfound = true;
                break;
            }
        }

    }

}
