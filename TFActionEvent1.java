package TestGUIAction;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFActionEvent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new tfFrame();
	}

}
class tfFrame extends Frame{
	tfFrame(){
		
		TextField tf = new TextField();//构造新文本字段
		add(tf);
		tf.addActionListener((ActionListener) new TFActionListener());//addActionListener(ActionListener l) 添加指定的操作侦听器，以从此文本字段接收操作事件
		pack();
		setVisible(true);
		setTitle("ActionEvent");
	}
		
}
class TFActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();//getSource()最初发生 Event 的对象
		System.out.println( tf.getText() );//getText()返回此文本组件表示的文本
		tf.setText("");//设置文本组件
	}
}
