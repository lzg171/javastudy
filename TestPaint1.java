package TestGUIAction;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class TestPaint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintFrame().launchFrame();
	}

}
class PaintFrame extends Frame{
	public void launchFrame() {
		setBounds(100, 100, 300,300);//设置边界
		setVisible(true);//设置窗口可见
		setBackground(Color.red);//设置背景颜色
	}
	//Frame 需要被重画的时候，paint会自动调用
	public void paint(Graphics g) {
		Color c = g.getColor();//获取当前颜色
		g.setColor(Color.orange);
		g.fillOval(50, 50, 80, 80);
		g.setColor(Color.blue);
		g.fillRect(60, 60, 60, 60);
		g.drawLine(50, 50, 200, 200);
		g.setColor(c);//把画笔 重新设置为当前颜色
		
	}
}
