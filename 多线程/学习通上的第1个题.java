class PassWindows implements Runnable{
	private int pass=10;
	public void run() {
		while(true) {
		 if(pass>0) {
	    Thread th = Thread.currentThread();
		String th_name = th.getName();
		System.out.println(th_name+"正在接送 "+pass--+"个乘客");
		 }
		
		}
	}
}
public class Main1{
	public static void main(String[] args) {
		PassWindows pw = new PassWindows();
		new Thread(pw,"第1辆出租车").start();
		new Thread(pw,"第2辆出租车").start();
		new Thread(pw,"第3辆出租车").start();
		new Thread(pw,"第4辆出租车").start();
		new Thread(pw,"第5辆出租车").start();
	}
}