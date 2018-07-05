package TestGUIAction;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseAdapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MymouseFrame("drawing:");
	}

}
class MymouseFrame extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Point> points = null;//ÿ�� ArrayList ʵ������һ����������������ָ�����洢�б�Ԫ�ص�����Ĵ�С�����������ٵ����б�Ĵ�С�������� ArrayList �в������Ԫ�أ�������Ҳ�Զ�����
	MymouseFrame(String s){
		super(s);
		points = new ArrayList<>();//����һ����ʼ����Ϊ 10 �Ŀ��б�
		setLayout(null);
		setBounds(100, 100, 400, 400);
		this.setBackground(Color.blue);
		setVisible(true);
		this.addMouseListener(new MouseMonitor());//addMouseListener(MouseListener l) ���ָ����������������Խ��շ��Դ����������¼�
	}
	public void paint(Graphics g) {
		Iterator<Point> i = points.iterator();//����������
		while(i.hasNext()) {
			Point p = (Point)i.next();//���ص���������һ��Ԫ��
			g.setColor(Color.ORANGE);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
	public void addPoint(Point p) {
		points.add(p);
	}
}
class MouseMonitor extends MouseAdapter{
	public void mousePressed(MouseEvent e) {
		MymouseFrame mf = (MymouseFrame)e.getSource();
		mf.addPoint(new Point( e.getX(), e.getY() ) );
		mf.repaint();
	}//��갴��������ϰ���ʱ����
}