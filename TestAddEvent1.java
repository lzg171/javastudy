package TestGUIAction;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class TestAddEvent1 {
	Frame f = new Frame("text");
	TextField tf = new TextField(10);
	Button b1 = new Button("start");
	
	public TestAddEvent1() {
		f.add(b1, BorderLayout.NORTH);
		f.add(tf, BorderLayout.SOUTH);
		//匿名类的使用
		b1.addActionListener(new ActionListener() {
			private int i;
			public void actionPerformed(ActionEvent e) {
				tf.setText(e.getActionCommand()+(++i));//setText()将此文本组件显示的文本设置为指定文本
			}//public String getActionCommand()返回与此动作相关的命令字符串
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.setVisible(false);
				System.exit(0);
			}
		});
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TestAddEvent1();
	}

}
