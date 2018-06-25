package TestThread;

public class TestThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner4 r = new Runner4();
		Thread t4 = new Thread(r);
		t4.start();
		for(int i=0;i<100000;i++) {
			if(i%10000 == 0 && i>0) {
				System.out.println("in Thread main i = "+i);
			}
		}
		System.out.println("The main Thread is over");
		r.shutDown();
	}

}
class Runner4 implements Runnable{
	private boolean flag = true;
	public void run() {
		int i=0;
		while( flag == true ) {
			System.out.println(" "+ i++);
		}
	}
	public void shutDown() {
		flag = false;
	}
}