package hello5;
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("MYThread类里的run()方法在运行");
		}
	}
}
public class Main{
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread tw = new Thread(myThread);
		tw.start();
		while(true) {
			System.out.println("main方法在运行");
		}
	}
}