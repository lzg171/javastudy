package TestGUIAction;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPassword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pfFrame();
	}

}
class pfFrame extends Frame{
	pfFrame(){
		
		TextField tf = new TextField();//�������ı��ֶ�
		add(tf);
		tf.addActionListener((ActionListener) new PFActionListener());//addActionListener(ActionListener l) ���ָ���Ĳ������������ԴӴ��ı��ֶν��ղ����¼�
		tf.setEchoChar('*');//���ô��ı��ֶεĻ����ַ�
		pack();
		setVisible(true);
	}
		
}
class PFActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();//getSource()������� Event �Ķ���
		System.out.println( tf.getText() );//getText()���ش��ı������ʾ���ı�
		tf.setText("");//�����ı����
	}
}
