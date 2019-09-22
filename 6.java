import java.util.Scanner;
interface Animal{
   void f1();
}
public class Main{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
         f2(new Animal(){
           public void f1(){
         System.out.println("喵喵……");
          }
       });

        f2(new Animal(){
         public void f1(){
        System.out.println("汪汪");
         }
      });
 }
  public static void f2(Animal an){
       an.f1();
 }
}