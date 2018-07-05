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
	ArrayList<Point> points = null;//每个 ArrayList 实例都有一个容量。该容量是指用来存储列表元素的数组的大小。它总是至少等于列表的大小。随着向 ArrayList 中不断添加元素，其容量也自动增长
	MymouseFrame(String s){
		super(s);
		points = new ArrayList<>();//构造一个初始容量为 10 的空列表
		setLayout(null);
		setBounds(100, 100, 400, 400);
		this.setBackground(Color.blue);
		setVisible(true);
		this.addMouseListener(new MouseMonitor());//addMouseListener(MouseListener l) 添加指定的鼠标侦听器，以接收发自此组件的鼠标事件
	}
	public void paint(Graphics g) {
		Iterator<Point> i = points.iterator();//产生迭代器
		while(i.hasNext()) {
			Point p = (Point)i.next();//返回迭代器的下一个元素
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
	}//鼠标按键在组件上按下时调用
}