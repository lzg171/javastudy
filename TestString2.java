package workspacejava;

public class TestString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1234567;
		String sNumber = String.valueOf( i );
		System.out.println("����"+sNumber.length()+"λ��");
		
		String s = "Mary,F,1989";
		String[] sPlit = s.split( "," );
		for(int j=0;j<sPlit.length;j++) {
			System.out.println( sPlit[j] );
		}
		
	}

}
