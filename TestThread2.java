package TestThread;

public class TestThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner12 r = new Runner12();
		Thread t1 = new Thread(r);//使用一个对象，可以创建两个线程
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
class Runner12 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("NO. "+i);
		}
	}
}