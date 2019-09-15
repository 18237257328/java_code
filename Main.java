import java.util.Scanner;
class Single{
 private Single(){}
 private static Single INSTANCE = new Single();
 public static Single getInstance(){
   return INSTANCE;
 }
}
public class Main{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   Single s1 = Single.getInstance();
   Single s2 = Single.getInstance();
   System.out.println(s1==s2);
 }
}
