package basic;
import java.util.*;
public class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int o = sc.nextInt();
        boolean isfound = false;
        for(int j=0;j<x-2;j++){
            for(int l=j+1;l<x-1;l++){
                for(int k=l+1;k<x;k++){
                    if(arr[j]+arr[l]+arr[k]== o){
                        isfound = true;
                        break;
                    }
                }
                isfound = true;
                break;
            }
            isfound=true;
            break;
        }
        if(isfound){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
