package TestGUIAction;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TestActionEvent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("test");
		f.setBounds(100, 100, 200, 100);
		f.setBackground(Color.darkGray);
		
		Button b = new Button("PRESS ME");
		f.add(b,BorderLayout.CENTER);
		
		Monitor mi = new Monitor();
		b.addActionListener(mi);
		f.pack();//�����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ���
		
		f.setVisible(true);
	}

}
class Monitor implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("a button has been pressed");
	}
}
