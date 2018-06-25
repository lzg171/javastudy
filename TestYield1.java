package TestThread;

public class TestYield1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t1 = new MyThread3("HK");
		MyThread3 t2 = new MyThread3("maco");
		MyThread3 t3 = new MyThread3("CHINA");
		t1.start();
		t2.start();
		t3.start();
	}

}
class MyThread3 extends Thread{
	MyThread3(String s){
		super(s);
	}
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println( getName()+" : "+i );
			if( i%10 == 0 ) {
				yield();
			}
		}
	}
}
