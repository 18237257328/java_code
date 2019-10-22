//方法一：
class MyThread extends Thread{
	public void run() {
		System.out.println("线程一");
	}
}
class MThread extends Thread{
	public void run() {
		System.out.println("线程二");
	}
}
public class Main1{
	public static void main(String[] args) {
		MyThread one = new MyThread();
		MThread two = new MThread();
		one.setName("线程一");
		two.setName("线程二");
		one.start();
		two.start();
	}
}
/*方法二：
class MyThread extends Thread{
	public void run() {
		Thread th = Thread.currentThread();
		String th_name = th.getName();
		System.out.println(th_name+"正在运行");
	}
}
public class Main1{
	public static void main(String[] args) {
		MyThread tw = new MyThread();
		new Thread(tw,"线程一").start();
		new Thread(tw,"线程二").start();
	}
}*/