package TestGUIAction;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestMath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mffFrame().launchFrame();
	}

}
class mffFrame extends Frame{
	TextField num1,num2,num3;//成员变量
	public void launchFrame() {
		num1 = new TextField(10);//构造具有指定列数的新空文本字段
		num2 = new TextField(10);
		num3 = new TextField(15);
		
		Label lbPlus = new Label("+");//使用指定的文本字符串构造一个新的标签，其文本对齐方式为左对齐
		Button btnEquals = new Button("=");
		
		btnEquals.addActionListener(new MyMonitor());//添加指定的动作侦听器，以接收发自此按钮的动作事件。当用户在此按钮上按下或释放鼠标时，发生动作事件
		
		setLayout(new FlowLayout());//Frame默认的是BorderLayout,在此设置为FlowLayout
		setTitle("加法计算器");//设置框架名称
		
		
		add(num1);
		add(lbPlus);
		add(num2);
		add(btnEquals);
		add(num3);
		pack();
		setVisible(true);
		
	}
	//内部类
	private class MyMonitor implements ActionListener{
			public void actionPerformed(ActionEvent e) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
			
		}
	}
}
