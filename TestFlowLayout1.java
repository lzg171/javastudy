package TestGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestFlowLayout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("flowlayout");
		Button b1 = new Button("ok");//����һ����ָ����ǩ�İ�ť
		Button b2 = new Button("open");//����һ����ָ����ǩ�İ�ť
		Button b3 = new Button();//����һ����ָ����ǩ�İ�ť,���û�б�ǩ����Ϊ null 
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));//���ô������Ĳ��ֹ�����
		
		f.setSize(300, 100);
		f.setVisible(true);
		
	}

}
