package TestGUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class TestFramePanel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame3(100,100,600,600,Color.BLUE);
	}

}
class MyFrame3 extends Frame{
	private Panel p1;
	MyFrame3(int x,int y,int w,int h,Color color){
		super("frame with panel");//super(s)
		setLayout(null);
		
		p1 = new Panel(null);
		
		p1.setBounds(w/4, h/4, w/2, h/2);
		p1.setBackground(Color.orange);
		
		setBounds(x, y, w, h);
		setBackground(color);
		add(p1);
		setVisible(true);//´°¿Ú¿É¼û
		
	}
}