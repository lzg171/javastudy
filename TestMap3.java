package TestBasicGeneric;

import java.nio.channels.NonWritableChannelException;
import java.util.HashMap;
import java.util.Map;

public class TestMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1 = new HashMap<String,Integer>();//���ͣ������ŵ�ʹ�ã�������String��Integer
		m1.put("one", 1);//�Զ�������ܣ��ѻ������� 1 ���Ϊ Integer����
		m1.put("two", 2);//�Զ�������ܣ��ѻ������� 2 ���Ϊ Integer����
		m1.put("three", 3);//�Զ�������ܣ��ѻ������� 3 ���Ϊ Integer����
		System.out.println(m1);
		System.out.println(m1.size());
		
		System.out.println(m1.containsKey("one"));
		
		if(m1.containsKey("two")) {
			int i = m1.get("two");//�Զ�������ܣ��� Integerת��Ϊ �������� int i
			System.out.println(i);
		}
	}

}
