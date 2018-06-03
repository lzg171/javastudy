package workspacejava;

public class TestStringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Microsoft";
		char[] s2 = {'a','b','c'};
		StringBuffer sb1 = new StringBuffer(s1);
		
		sb1.append('/').append("Sum").append('/').append("IBM");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("number");
		for(int i=0;i<10;i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		
		sb2.delete(8, sb2.length() ).insert(0, s2);
		System.out.println(sb2);
		
		sb2.reverse();//×Ö·û´®ÖÐ×Ö·û·´×ª
		System.out.println(sb2);
	}

}
