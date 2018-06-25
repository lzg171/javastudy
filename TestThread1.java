package TestThread;

public class TestThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner1 r = new Runner1();
		r.start();
		//Thread t = new Thread(r);
		
		//t.start();
		for(int i=0;i<100;i++) {
			System.out.println("Main Thread: "+i);
		}
		
	}

}
class Runner1 extends Thread
/*
class Runner1 implements Runnable	*/{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Runner1: "+i);
		}
	}
}
