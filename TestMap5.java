package TestBasicGeneric;

import java.util.HashMap;
import java.util.Map;

public class TestMap5 {
	private static final int ONE = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String,Integer>();//泛型：尖括号的使用，定义了String和Integer
		for(int i=0;i<args.length;i++) {
			if( !m.containsKey(args[i])) {
				m.put(args[i], ONE);
			}
			else {
				int freq = m.get(args[i]);
				m.put(args[i], freq+1);
			}
		}
		System.out.println(m.size()+" words has detected");
		System.out.println(m);
		
		
	}

}
