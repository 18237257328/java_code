class BookWindows implements Runnable{
	private int book=10;
	public void run() {
		while(book>0) {
		//if(book>0){
		Thread th = Thread.currentThread();
			String th_name = th.getName();
			System.out.println(th_name+"正在分发第"+book--+"本书");
		}
		//}
	}
}
public class Main1{
	public static void main(String[] args) {
		BookWindows bw = new BookWindows();
		new Thread(bw,"教师1").start();
		new Thread(bw,"教师2").start();
		new Thread(bw,"教师3").start();
	}
}