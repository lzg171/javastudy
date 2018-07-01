package TestGUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.nio.channels.NonWritableChannelException;

public class TestPanel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("java frame with panel");
		Panel p = new Panel(null);
		f.setLayout(null);
		f.setBounds(100, 100, 500, 500);
		f.setBackground(new Color(0, 0, 102));
		p.setBounds(50, 50, 400, 400);
		p.setBackground(new Color(204, 204, 235));
		f.add(p);
		f.setVisible(true);
	}

}
