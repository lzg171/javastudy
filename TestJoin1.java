package TestThread;

import javax.net.ssl.SSLException;

public class TestJoin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt2 = new MyThread2("HK");
		Thread td2 = new Thread(mt2);
		
		td2.start();
		try {
			td2.join();
			
		}
		catch(InterruptedException e) {
			
		}
		for(int i=1;i<=10;i++) {
			System.out.println("i am main thread");
		}
	}

}
class MyThread2 extends Thread{
	MyThread2(String s){
		super(s);
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println( "i am "+getName() );
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				return ;
			}
		}
	}
}