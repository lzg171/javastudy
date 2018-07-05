package TestGUIAction;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestKeyEvent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyKeyFrame("key event");
	}

}
class MyKeyFrame extends Frame{
	public MyKeyFrame(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		setLayout(null);
		setBounds(100, 100, 250, 250);
		setBackground(Color.magenta);
		setVisible(true);
		this.addKeyListener(new KeyMonitor());
	}
	
	//内部类
	class KeyMonitor extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			//System.out.println("ok");用于测试键盘是否可监听
			int KeyCode = e.getKeyCode();
			if(KeyCode == KeyEvent.VK_UP) {
				System.out.println("up");
			}
			
		}
		
	}
}
