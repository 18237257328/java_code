import java.util.Scanner;
class Animal{
   String name;
   public void f1(){
        System.out.println("动物发出叫声");
 }
}
class Dog extends Animal{
     public void f2(){
        System.out.println("我是一只狗，名字是"+" "+name);
 }
}
public class Main{
 public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Dog p = new Dog();
      p.name = "shapigou";
      p.f1();
      p.f2();
 }
}
