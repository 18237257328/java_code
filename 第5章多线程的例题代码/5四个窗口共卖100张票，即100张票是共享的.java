package hello5;
class TicketsWindows implements Runnable{
	private int tickets=100;
	public void run() {
		while(true) {
			if(tickets>0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"正在发售第"+tickets--+"张票");
			}
		}
	}
}
public class Main{
	public static void main(String[] args) {
		TicketsWindows tw = new TicketsWindows();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
	}
}