package TestGUI;

import java.awt.Color;
import java.awt.Frame;

public class TestMultiFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f1 = new MyFrame(100, 100, 200, 200, Color.black);
		MyFrame f2 = new MyFrame(300, 100,200, 200, Color.BLUE);
		MyFrame f3 = new MyFrame(100, 300, 200, 200, Color.GRAY);
		MyFrame f4 = new MyFrame(300, 300, 200, 200, Color.CYAN);
	}

}
class MyFrame extends Frame{
	static int id = 0;
	MyFrame(int x,int y,int w,int h,Color color){
		super("MyFrame"+(++id) );
		setBackground(color);
		setLayout(null);
		setBounds(x,y,w,h);
		setVisible(true);
	}
}