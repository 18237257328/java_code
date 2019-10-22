class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("new");
		}
	}
}
public class Main1{
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		for(int i=0;i<100;i++) {
			System.out.println("main");
		}
		
	}
}