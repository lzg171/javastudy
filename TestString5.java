package workspacejava;

public class TestString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaajava-java-makglajava";
		String sFind = "java";//����һ���µ��ַ���
				
		int count = 0;
		int index = -1;//��ʼ��
		/* 
		 * index = s.indexOf(sFind)//�ַ���s�г��� ���ַ��� "java"�ĵ�һ���ַ�'j'���ڵ�λ��
		
		 
		*/
		while( ( index = s.indexOf(sFind) ) != -1 ) {			
			s = s.substring( index + sFind.length() );//�޼��ַ������ӵ� index+sFind.length() ���ַ���ʼ����β
			count++;
		}
		System.out.println( "the java string appears "+count+" times" );
	}

}
