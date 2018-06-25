

package TestThread;

public class TestProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncStack basket = new SyncStack();
		Producer p = new Producer(basket);
		Consumer c = new Consumer(basket);
		
		new Thread(p).start();
		new Thread(p).start();//可以有多个生产者
		new Thread(c).start();
		
	}

}
class WoTou{
	int id;
	WoTou(int id){
		this.id = id;
	}
	public String toString() {
		return "WoTou: "+id;//重写toString() 方法
	}
}
class SyncStack{
	int index = 0;
	WoTou[] arrWT = new WoTou[6];//篮子里能装6个馒头
	
	public synchronized void push( WoTou wt) {
		
		while(index == arrWT.length ) {
			try{
				this.wait();//Object类下面的方法，wait()--当前正在访问该对象的线程 等待.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();//唤醒在此对象监视器上等待的单个线程。如果所有线程都在此对象上等待，则会选择唤醒其中一个线程
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
	SyncStack basket = null;//拥有这个篮子的引用，往这个篮子里生产馒头
	
	Producer(SyncStack basket){
		this.basket = basket;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			WoTou wt = new WoTou(i);
			basket.push(wt);//往篮子里放馒头
			
			System.out.println("生产了: "+wt);
			
			try {
				Thread.sleep( (int) (Math.random()*200) );
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable{
	SyncStack basket = null;//拥有这个篮子的引用，从这个篮子里拿出馒头
	
	Consumer(SyncStack basket){
		this.basket = basket;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			WoTou wt = basket.pop();//拿出馒头后，返回值
			System.out.println("消费了： "+wt);
			
			try {
				Thread.sleep( (int) (Math.random()*1000) );
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}