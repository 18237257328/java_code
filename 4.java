import java.util.Scanner;
interface Animal{
  void f1();
}
class Dog implements Animal{
   public void f1(){
      System.out.println("汪汪汪");
 }
}
class Cat implements Animal{
   public void f1(){
    System.out.println("喵喵喵");
 }
}
public class Main{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Animal p1 = new Dog();
      Animal p2 = new Cat();
      f2(p1);
      f2(p2);
 }
 public static void f2(Animal an){
     an.f1();
 }
}
