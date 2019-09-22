import java.util.Scanner;
class Animal{
      public void f1(){
       System.out.println("动物发出叫声");
 }
}
class Dog extends Animal{
     public void f1(){
      System.out.println("我是一只狗，能发出汪汪的叫声");
 }
}
public class Main{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
    Dog  p = new Dog();
   p.f1();
 }
}
