package TestGUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
//FlowLayout��Panel�Ĳ��ֹ�����
public class TestFlowLayout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("testflowlayout2");
		
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 40);
		f.setLayout(fl);//���ô������Ĳ��ֹ�����
		
		f.setLocation(200, 300);
		f.setSize(200, 200);
		f.setBackground(new Color(0, 120, 20));
		for(int i=0;i<7;i++) {
			f.add(new Button("open"));//������
		}
		f.setVisible(true);//���ڿ��ӻ�

	}
}
