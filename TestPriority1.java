package TestThread;

public class TestPriority1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread( new T1() );
		Thread t2 = new Thread( new T2() );
		
		t1.setPriority(Thread.NORM_PRIORITY+3);//默认线程值是5，设置t1为高优先级
		
		t1.start();
		t2.start();
	}

}
class T1 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("T1: "+i);
		}
	}
}
class T2 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("T2: "+i);
		}
	}
}