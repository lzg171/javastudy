package TestThread;

import java.util.Date;

public class TestInterrupt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mth = new MyThread();
		Thread th = new Thread(mth);
		th.start();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
		}
		//th.interrupt();
		MyThread.flag = false ;
	}

}
class MyThread implements Runnable{
	static boolean flag = true;
	public void run() {
		while(flag) {
			System.out.println("==="+ new Date()+"===");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}