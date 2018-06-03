package workspacejava;

public class TestString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaajava-java-makglajava";
		String sFind = "java";//定义一个新的字符串
				
		int count = 0;
		int index = -1;//初始化
		/* 
		 * index = s.indexOf(sFind)//字符串s中出现 新字符串 "java"的第一个字符'j'所在的位置
		
		 
		*/
		while( ( index = s.indexOf(sFind) ) != -1 ) {			
			s = s.substring( index + sFind.length() );//修剪字符串，从第 index+sFind.length() 个字符开始到结尾
			count++;
		}
		System.out.println( "the java string appears "+count+" times" );
	}

}
