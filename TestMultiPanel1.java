package TestGUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class TestMultiPanel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2("MyFrame with panel", 300, 300, 400, 400);
	}

}
class MyFrame2 extends Frame{
	private Panel p1,p2,p3,p4;
	MyFrame2(String s,int x,int y,int w,int h){
		super(s);
		setLayout(null);
		
		p1 = new Panel(null);
		p2 = new Panel(null);
		p3 = new Panel(null);
		p4 = new Panel(null);
		
		p1.setBounds(0, 0, w/2, h/2);
		p2.setBounds(w/2, 0, w/2, h/2);
		p3.setBounds(0, h/2, w/2, h/2);
		p4.setBounds(w/2, h/2, w/2, h/2);
		p1.setBackground(Color.BLACK);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.gray);
		p4.setBackground(Color.GREEN);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		setBounds(x,y,w,h);
		setVisible(true);
		
	}
}
