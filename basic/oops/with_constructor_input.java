package basic.oops;
import java.util.*;
class Emp{
    int id;
    String name;
    int salary;
    Emp(int i,String n, int s){
        id =i;
        name = n;
        salary = s;}
    void disp(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
public class with_constructor_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int x = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        for(int i=0; i<x; i++){
            System.out.println("Enter employee " + (i+1) + " ID:");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            System.out.println("Enter employee " + (i+1) + " Name:");
            String name = sc.nextLine();
            
            System.out.println("Enter employee " + (i+1) + " Salary:");
            int salary = sc.nextInt();
            
            Emp e1 = new Emp(id, name, salary);
            e1.disp();
        }
        sc.close();
    }
}
