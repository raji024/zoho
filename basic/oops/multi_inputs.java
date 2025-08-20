package basic.oops;
import java.util.*;

class Book {
    String b_name;
    String a_name;
    void print() {
        System.out.println(b_name + " is written by " + a_name);
    }
}

public class multi_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int x = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        for (int i = 1; i <= x; i++) {
            System.out.println("Enter book " + i + " name:");
            Book b1 = new Book();
            b1.b_name = sc.nextLine();
            
            System.out.println("Enter author " + i + " name:");
            b1.a_name = sc.nextLine();
            
            b1.print();
        }
        sc.close();
    }
}
