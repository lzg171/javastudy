package TestGUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
//BorderLayout是Frame的布局管理器
public class TestBorderLayout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f = new Frame("BorderLayout1");
		
		Button bn = new Button("BN");
		Button bs = new Button("BS");
		Button bw = new Button("BW");
		Button be = new Button("BE");
		Button bc = new Button("BC");
		
		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}

}
