package TestGUI;

import java.awt.Color;
import java.awt.Frame;

public class TestGUI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("my first frame");
		f.setLocation(300, 300);
		f.setSize(150, 100);//设置窗口大小，像素
		f.setBackground(Color.black);//设置背景色
		//f.setResizable(false);//窗口大小不能改变
		
		f.setVisible(true);//设置窗口可见
	}

}
