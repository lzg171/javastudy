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
		setBounds(100, 100, 300,300);//���ñ߽�
		setVisible(true);//���ô��ڿɼ�
		setBackground(Color.red);//���ñ�����ɫ
	}
	//Frame ��Ҫ���ػ���ʱ��paint���Զ�����
	public void paint(Graphics g) {
		Color c = g.getColor();//��ȡ��ǰ��ɫ
		g.setColor(Color.orange);
		g.fillOval(50, 50, 80, 80);
		g.setColor(Color.blue);
		g.fillRect(60, 60, 60, 60);
		g.drawLine(50, 50, 200, 200);
		g.setColor(c);//�ѻ��� ��������Ϊ��ǰ��ɫ
		
	}
}
