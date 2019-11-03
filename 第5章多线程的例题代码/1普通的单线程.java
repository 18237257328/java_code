package hello5;
class MyThread{
	public void run() {
		while(true) {
			System.out.println("MyThread类的run方法在运行");
		}
	}
}
public class Main{
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.run();
		while(true) {
			System.out.println("main方法在运行");
		}
	}
}