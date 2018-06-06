package TestBasicGeneric;

import java.nio.channels.NonWritableChannelException;
import java.util.HashMap;
import java.util.Map;

public class TestMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1 = new HashMap<String,Integer>();//泛型：尖括号的使用，定义了String和Integer
		m1.put("one", 1);//自动打包功能，把基础类型 1 打包为 Integer对象
		m1.put("two", 2);//自动打包功能，把基础类型 2 打包为 Integer对象
		m1.put("three", 3);//自动打包功能，把基础类型 3 打包为 Integer对象
		System.out.println(m1);
		System.out.println(m1.size());
		
		System.out.println(m1.containsKey("one"));
		
		if(m1.containsKey("two")) {
			int i = m1.get("two");//自动解包功能，把 Integer转换为 基础类型 int i
			System.out.println(i);
		}
	}

}
