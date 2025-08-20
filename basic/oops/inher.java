package basic.oops;
import java.util.*;
class animal{
    void g1(){
        System.out.println("this is raji");
    }
}
class  Dog extends animal{
    void eat(){
        System.out.println("this is dog");
    }
}
public class inher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog d1 = new Dog();
        d1.g1();
        d1.eat();

    }
}
