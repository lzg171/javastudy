package TestGUI;

import java.awt.Color;
import java.awt.Frame;

public class TestGUI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("my first frame");
		f.setLocation(300, 300);
		f.setSize(150, 100);//���ô��ڴ�С������
		f.setBackground(Color.black);//���ñ���ɫ
		//f.setResizable(false);//���ڴ�С���ܸı�
		
		f.setVisible(true);//���ô��ڿɼ�
	}

}
