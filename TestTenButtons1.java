package TestGUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;


public class TestTenButtons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("JAVA FRAME");
		f.setLayout(new GridLayout(2, 1));//���ô������Ĳ��ֹ�����,2��1��
		f.setLocation(200, 200);
		f.setSize(300, 300);
		f.setBackground(Color.orange);
		
		Panel p1 = new Panel( new BorderLayout() );//Panel ����򵥵�������
		Panel p2 = new Panel( new BorderLayout() );//����һ�����������ı߿򲼾֣������Զ�����������а��ţ����������С��ʹ���������������򣺱����ϡ����������С�ÿ���������ֻ�ܰ���һ���������ͨ����Ӧ�ĳ������б�ʶ��NORTH��SOUTH��EAST��WEST��CENTER
		Panel p11 = new Panel( new GridLayout(2, 1) );//GridLayout ����һ�����ִ����������Ծ���������ʽ��������������в���
		Panel p21 = new Panel( new GridLayout(2, 2) );
		
		p1.add(new Button("BUTTON"), BorderLayout.WEST);
		p1.add(new Button("Button"), BorderLayout.EAST);
		//p1.add(new Button("Center"), BorderLayout.CENTER);
		//p1.add(new Button("north"), BorderLayout.NORTH);
		
		p11.add(new Button("p111"));
		p11.add(new Button("p111"));
		
		p1.add(p11, BorderLayout.CENTER);
		
		p2.add(new Button("BUTTON"), BorderLayout.WEST);
		p2.add(new Button("BUTTON"), BorderLayout.EAST);
		
		for(int i=0;i<4;i++) {
			p21.add(new Button("P211"));
		}
		
		p2.add(p21, BorderLayout.CENTER);
		
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
	}

}
