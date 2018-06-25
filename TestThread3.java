package TestThread;

public class TestThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner13 r = new Runner13();
		Thread t5 = new Thread(r);
		t5.start();
	}

}
class Runner13 implements Runnable{
	public void run() {
		for(int i=0;i<=30;i++) {
			if( i%10 == 0 && i != 0 ) {
				try{
					Thread.sleep(2000);
					System.out.println("sleep 2000 ms");
				}catch(InterruptedException e) {
					
				}
			}
			System.out.println("NO. "+i);
		}
	}
}