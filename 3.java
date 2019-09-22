import java.util.Scanner;
interface Animal{
     int ID=1;
     void f1();
      void f2();
}
class Dog implements Animal{
     public void f1(){
    System.out.println("在呼吸");
  }
     public void f2(){
    System.out.println("在跑步");
  }
}
public class Main{
 public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Dog  p = new Dog();
      p.f1();
       p.f2();
 }
}
