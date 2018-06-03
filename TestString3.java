package workspacejava;

//import java.awt.geom.Arc2D.Double;

public class TestString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="ABCDEFGabcdefg1234556";
		System.out.println(s);
		/*
		int upnum= 0 ;
		int lownum = 0;
		int noncharacter = 0;
	
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if( c >='a' && c <= 'z' ) {
				lownum++;
			}
			else if( c >= 'A' && c <= 'Z') {
				upnum++;
			}
			else {
				noncharacter++;
			}
			
		}
		*/
		
		/*
		String sL = "abcdefghijklmnopqrstuvwxyz";
		String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int upnum= 0 ;
		int lownum = 0;
		int noncharacter = 0;
	
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if( sL.indexOf(c) != -1 ) {
				lownum++;
			}
			else if( sU.indexOf(c) != -1 ) {
				upnum++;
			}
			else {
				noncharacter++;
			}
			
		}
		*/
		
		int upnum= 0 ;
		int lownum = 0;
		int noncharacter = 0;
	
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if( Character.isLowerCase(c) ) {
				lownum++;
			}
			else if( Character.isUpperCase(c) ) {
				upnum++;
			}
			else {
				noncharacter++;
			}
			
		}
		
		System.out.println("upnum is: "+upnum);
		System.out.println("lownum is: "+upnum);
		System.out.println("noncharacter is: "+upnum);
		
	}

}
