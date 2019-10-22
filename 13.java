class FileWindows implements Runnable{
	private int num=100;
	public void run() {
		while(num>0) {
			Thread th = Thread.currentThread();
			String th_name = th.getName();
			System.out.println(th_name+"正在下载第"+"file["+num--+"]段文件");
		 }
		}
	}
public class Main1{
	public static void main(String[] args) {
		FileWindows tw = new FileWindows();
		new Thread(tw, "线程一").start();
		new Thread(tw,"线程二").start();
		new Thread(tw,"线程三").start();
		new Thread(tw,"线程四").start();
		new Thread(tw,"线程五").start();
	}
}