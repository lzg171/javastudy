

package TestThread;

public class TestProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncStack basket = new SyncStack();
		Producer p = new Producer(basket);
		Consumer c = new Consumer(basket);
		
		new Thread(p).start();
		new Thread(p).start();//�����ж��������
		new Thread(c).start();
		
	}

}
class WoTou{
	int id;
	WoTou(int id){
		this.id = id;
	}
	public String toString() {
		return "WoTou: "+id;//��дtoString() ����
	}
}
class SyncStack{
	int index = 0;
	WoTou[] arrWT = new WoTou[6];//��������װ6����ͷ
	
	public synchronized void push( WoTou wt) {
		
		while(index == arrWT.length ) {
			try{
				this.wait();//Object������ķ�����wait()--��ǰ���ڷ��ʸö�����߳� �ȴ�.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();//�����ڴ˶���������ϵȴ��ĵ����̡߳���������̶߳��ڴ˶����ϵȴ������ѡ��������һ���߳�
		arrWT[index] = wt;
		index++;
	}
	public synchronized WoTou pop() {
		while(index == 0) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		index--;
		return arrWT[index];
	}
}
class Producer implements Runnable{
	SyncStack basket = null;//ӵ��������ӵ����ã������������������ͷ
	
	Producer(SyncStack basket){
		this.basket = basket;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			WoTou wt = new WoTou(i);
			basket.push(wt);//�����������ͷ
			
			System.out.println("������: "+wt);
			
			try {
				Thread.sleep( (int) (Math.random()*200) );
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable{
	SyncStack basket = null;//ӵ��������ӵ����ã�������������ó���ͷ
	
	Consumer(SyncStack basket){
		this.basket = basket;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			WoTou wt = basket.pop();//�ó���ͷ�󣬷���ֵ
			System.out.println("�����ˣ� "+wt);
			
			try {
				Thread.sleep( (int) (Math.random()*1000) );
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}