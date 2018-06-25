package TestThread;

public class TestTT1 implements Runnable {

	int b = 100;
	public synchronized void m1() throws Exception{
		b = 1000;
		Thread.sleep(5000);
		System.out.println("m1 b : "+b);
	}
	public synchronized void m2() throws Exception {
		Thread.sleep(2500);
		b = 2000;
		System.out.println("m2 b : "+b);
	}
	public void run() {
		try {
			m1();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		TestTT1 tt = new TestTT1();
		Thread t = new Thread(tt);
		t.start();
		
		Thread.sleep(1000);
		tt.m2();//另外一个线程可以访问没有锁定的方法,如果都锁定，则不能访问，互斥
	}
}
