package hello;
import java.util.*;
class Storage {
	private int inPos,outPos;
	private String[] cells = new String[100];
	private int count,flag;
	private Random r = new Random();

	public synchronized void put(int num) {
		try {
		    count = r.nextInt(100);
			while(count==cells.length) {
				this.wait();
				}
			cells[inPos]=String.valueOf(num);
			System.out.print(cells[inPos]+"用户登录---");
		    inPos++;
		    if(inPos==cells.length) inPos=0;
		    count++;
		    System.out.println("当前在线人数是"+count);
		    this.notify();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
public synchronized void get() {
		try {
		    count = r.nextInt(100);
			while(count==1) {
				this.wait();
			}
			String data=cells[outPos];
			System.out.print(data+"用户*******注销---");
			outPos++;
			if(outPos==cells.length) outPos=0;
			count--;
			System.out.println("当前在线人数是"+count);
			this.notify();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Input implements Runnable{
	private Storage st;
	private Random r = new Random();
	private int num;
	Input(Storage st){
		this.st = st;
	}
	public void run() {
		while(true) {
			num = r.nextInt(100);
			st.put(num);
		}
	 }
}
class Output implements Runnable{
	private Storage st;
	Output(Storage st){
		this.st = st;
	}
	public void run() {
		while(true) {
			st.get();
		}
	}
}
public class Main{
	public static void main(String[] args) {
	        Storage st = new Storage();
	        Input input = new Input(st);
	        Output output = new Output(st);
	        new Thread(input).start();
	        new Thread(output).start();
	}
}