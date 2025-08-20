package basic.oops;
import java.util.*;
class Car{
    String vehicle;
    int speed;
    void disp(){
        System.out.println(vehicle+" is my car with good speed of "+speed);
    }

}
public class basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        c1.vehicle ="audi";
        c1.speed = 150;
        c1.disp();
    }   
}
