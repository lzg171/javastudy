package TestBasicGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c = new ArrayList<String>();//尖括号内String表示，只能装字符串类型
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		for(int i=0;i<c.size();i++) {
			String s = c.get(i);
			System.out.println(s);
		}
		
		Collection<String> c2 = new HashSet<String>();
		c2.add("fff");
		c2.add("ggg");
		c2.add("kkk");
		for( Iterator<String> it = c2.iterator();it.hasNext();) {
			String m = it.next();
			System.out.println(m);
		}
	}

}
//泛型
class MyName implements Comparable<MyName>{
	int age;
	public int compareTo(MyName mn) {
		if(this.age < mn.age) {
			return -1;
		}		
		else if(this.age > mn.age ) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

