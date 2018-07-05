package TestGUIAction;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("test");
		Button b1 = new Button("start");
		Button b2 = new Button("stop");
		
		Monitor2 mi2 = new Monitor2();
		b1.addActionListener(mi2);
		b2.addActionListener(mi2);
		//b2.setActionCommand("game over");//设置此按钮激发的动作事件的命令名称
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

}
class Monitor2 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("a button has been pressed,"+"the relative info is:\n"+e.getActionCommand());//getActionCommand()返回与此动作相关的命令字符串
	} 
}
