package workspacejava;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> na = new ArrayList<>();
		na.add("skj");
		na.add("skf");
		String a = na.get(0);
		System.out.println(a);
		Set<String> ma = new HashSet<>();
		ma.add("jin");
		String b = ma.iterator().next();
		System.out.println(b);
		
		Map<String, String> h = new HashMap<>();
		h.put("mm", "kk");
		h.get("mm");
		System.out.println(h.get("mm"));
		h.put("mm", "hk");
		System.out.println(h.get("mm"));
	}

}
