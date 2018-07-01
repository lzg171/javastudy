package TestGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestFlowLayout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("flowlayout");
		Button b1 = new Button("ok");//构造一个带指定标签的按钮
		Button b2 = new Button("open");//构造一个带指定标签的按钮
		Button b3 = new Button();//构造一个带指定标签的按钮,如果没有标签，则为 null 
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));//设置此容器的布局管理器
		
		f.setSize(300, 100);
		f.setVisible(true);
		
	}

}
