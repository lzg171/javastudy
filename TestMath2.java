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
	TextField num1,num2,num3;//��Ա����
	public void launchFrame() {
		num1 = new TextField(10);//�������ָ���������¿��ı��ֶ�
		num2 = new TextField(10);
		num3 = new TextField(15);
		
		Label lbPlus = new Label("+");//ʹ��ָ�����ı��ַ�������һ���µı�ǩ�����ı����뷽ʽΪ�����
		Button btnEquals = new Button("=");
		
		btnEquals.addActionListener(new MyMonitor());//���ָ���Ķ������������Խ��շ��Դ˰�ť�Ķ����¼������û��ڴ˰�ť�ϰ��»��ͷ����ʱ�����������¼�
		
		setLayout(new FlowLayout());//FrameĬ�ϵ���BorderLayout,�ڴ�����ΪFlowLayout
		setTitle("�ӷ�������");//���ÿ������
		
		
		add(num1);
		add(lbPlus);
		add(num2);
		add(btnEquals);
		add(num3);
		pack();
		setVisible(true);
		
	}
	//�ڲ���
	private class MyMonitor implements ActionListener{
			public void actionPerformed(ActionEvent e) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
			
		}
	}
}
