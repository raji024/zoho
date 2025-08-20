package basic.oops;
class CAR{
   String vehicle;
   int speed;
   CAR(String n,int a){
    vehicle = n;
    speed = a;

   }
   void disp(){
    System.out.println(vehicle+"it is good with speed of"+speed);
   }
}
public class with_constructor {
    public static void main(String[] args){
        CAR c1 = new CAR("benz",150);
        c1.disp();

    }
}
