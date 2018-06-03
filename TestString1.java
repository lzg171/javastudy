package workspacejava;

public class TestString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "world";
		String d = "HELLO";
		String s5 = "我在学Java";
		
		System.out.println( s1 == s2 );
		
		s1 = new String( "hello" );
		s2 = new String( "hello" );
		System.out.println( s1 == s2 );
		System.out.println( s1.equals(s2) );
		System.out.println( s1.equalsIgnoreCase(d) );
		System.out.println( s5.replace("我", "你") );
	}

}
