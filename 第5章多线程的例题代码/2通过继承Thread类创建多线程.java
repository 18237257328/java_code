package hello5;
class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("MyThread类里的run方法在运行");
		}
	}
}
public class Main{
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		while(true) {
			System.out.println("main方法在运行");
		}
	}
}