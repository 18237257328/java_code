package hello5;
class SaleThread implements Runnable{
	private int tickets=10;
	Object lock = new Object();
	
	public void run() {
		synchronized(lock){
		while(tickets>0) {
				try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
			}
			
		}
	}
}
public class Main{
	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread();
		new Thread(saleThread,"线程一").start();
		new Thread(saleThread,"线程二").start();
		new Thread(saleThread,"线程三").start();
		new Thread(saleThread,"线程四").start();
	}
}