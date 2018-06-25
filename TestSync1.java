package TestThread;

public class TestSync1 implements Runnable{
	Timer tm = new Timer();
	public static void main(String[] agrs) {
		TestSync1 test = new TestSync1();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		
		t1.setName("aa");
		t2.setName("bb");
		
		t1.start();
		t2.start();
	}
	public void run() {
		tm.add( Thread.currentThread().getName() );
	}
}
class Timer{
	private static int num = 0;
	/*synchronized ִ�з����Ĺ����У�������ǰ�Ķ���*/
	public synchronized void add(String name) {
		num++;
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e) {}
		System.out.println(name+"���ǵ�"+num+"��ʹ��timer���߳�");
	}
}