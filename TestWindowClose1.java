package TestGUIAction;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowClose1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindowFrame("MyWindowFrame");
	}

}
class MyWindowFrame extends Frame{
	MyWindowFrame(String s){
		super(s);
		setLayout(null);
		setBounds(100, 100, 300, 300);
		this.setBackground(Color.cyan);
		setVisible(true);
		//this.addWindowListener( new MyWindowMonitor() );
		
		//������,д�ڷ���֮�ڵ�
		this.addWindowListener(new WindowAdapter() 
			{
				public void windowClosing(WindowEvent e) {
					setVisible(false);
					System.exit(0);
				}
			});
		
	}
	/*
	//�ڲ���
	class MyWindowMonitor extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			setVisible(false);
			System.exit(0);
		}

	}
	*/
}

