package TestThread;

public class TestThread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t6 = new Runner6();
		t6.start();
		
		for(int i=0;i<50;i++) {
			System.out.println("main Thread : "+i);
		}
	}

}
class Runner6 extends Thread{
	public void run() {
		System.out.println( Thread.currentThread().isAlive() );//·µ»ØbooleanÀàÐÍ
		for(int i=0;i<50;i++) {
			System.out.println("subThread : "+i);
		}
	}
}