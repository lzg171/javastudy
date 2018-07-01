package TestGUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;


public class TestTenButtons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("JAVA FRAME");
		f.setLayout(new GridLayout(2, 1));//设置此容器的布局管理器,2行1列
		f.setLocation(200, 200);
		f.setSize(300, 300);
		f.setBackground(Color.orange);
		
		Panel p1 = new Panel( new BorderLayout() );//Panel 是最简单的容器类
		Panel p2 = new Panel( new BorderLayout() );//这是一个布置容器的边框布局，它可以对容器组件进行安排，并调整其大小，使其符合下列五个区域：北、南、东、西、中。每个区域最多只能包含一个组件，并通过相应的常量进行标识：NORTH、SOUTH、EAST、WEST、CENTER
		Panel p11 = new Panel( new GridLayout(2, 1) );//GridLayout 类是一个布局处理器，它以矩形网格形式对容器的组件进行布置
		Panel p21 = new Panel( new GridLayout(2, 2) );
		
		p1.add(new Button("BUTTON"), BorderLayout.WEST);
		p1.add(new Button("Button"), BorderLayout.EAST);
		//p1.add(new Button("Center"), BorderLayout.CENTER);
		//p1.add(new Button("north"), BorderLayout.NORTH);
		
		p11.add(new Button("p111"));
		p11.add(new Button("p111"));
		
		p1.add(p11, BorderLayout.CENTER);
		
		p2.add(new Button("BUTTON"), BorderLayout.WEST);
		p2.add(new Button("BUTTON"), BorderLayout.EAST);
		
		for(int i=0;i<4;i++) {
			p21.add(new Button("P211"));
		}
		
		p2.add(p21, BorderLayout.CENTER);
		
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
	}

}
