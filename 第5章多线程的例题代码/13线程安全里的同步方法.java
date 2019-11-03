package hello5;
class Ticket1 implements Runnable{
	private int tickets=10;
	public void run() {
		while(true) {
			saleTicket();
			if(tickets<=0) break;
		}
	}
	private synchronized void saleTicket() {
		if(tickets>0) {
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
public class Main{
	public static void main(String[] args) {
		Ticket1 ticket1 = new Ticket1();
		new Thread(ticket1,"线程一").start();
		new Thread(ticket1,"线程二").start();
		new Thread(ticket1,"线程三").start();
		new Thread(ticket1,"线程四 ").start();
	}
}