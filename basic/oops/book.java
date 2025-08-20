
package basic.oops;
import java.util.*;
class b{
    String title;
    String author;
    int price;
    void print(){
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
public class book {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<x;i++){
            b b1 = new b();
            b1.title = sc.nextLine();
            b1.author = sc.nextLine();
            b1.price = sc.nextInt();
            b1.print();

        }

    }
}
