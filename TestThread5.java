package TestThread;

public class TestThread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner15 r = new Runner15();
		Thread t5 = new Thread(r);
		t5.start();
		try {
			t5.join();//等待该线程终止
		}catch(InterruptedException e) {}
		for(int i=0;i<50;i++) {
			System.out.println("main Thread : "+i);
		}
	}

}
class Runner15 implements Runnable{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("subThread : "+i);
		}
		
	}
}