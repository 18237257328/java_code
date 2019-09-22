import java.util.Scanner;
interface Animal{
  void f1();
}
class Dog implements Animal{
    public void f1(){
     System.out.println("汪汪汪");
 }
   public void f2(){
     System.out.println("狗在睡觉");
 }
}
public class Main{
 public static void main(String[] args){
     Scanner  scan = new Scanner(System.in);
     Animal p = new Dog();
    f3(p);
 }
public static void f3(Animal an){
       Dog an1 = (Dog) an;
      an1.f2();
 }
}
