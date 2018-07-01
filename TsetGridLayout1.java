package TestGUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class TsetGridLayout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("gridlayout example");
		
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("b4");
		Button b5 = new Button("b5");
		Button b6 = new Button("b6");
		
		f.setLayout(new GridLayout(3, 2));//创建具有指定行数和列数的网格布局
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		f.pack();
		f.setVisible(true);
	}

}
