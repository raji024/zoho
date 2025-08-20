package paaterns;
import java.util.*;
public class pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=x;i>=1;i--){
            for(int j=i;j<=x-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            } 
            System.out.println();  

        }
    }
}
