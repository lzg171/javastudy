package TestIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("f:\\javaworkspace\\Test.java");
			out = new FileOutputStream("f:\\javaworkspace\\TestFileOutPutStream555.java");
			while( (b = in.read() ) != -1 ) {
				out.write(b);
			}
			in.close();
			out.close();
		}
		catch(FileNotFoundException e2) {
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}
		catch( IOException e1) {
			System.out.println("�ļ����ƴ���");
			System.exit(-1);
		}
		System.out.println("�ļ��Ѿ�����");
		
		//���³������ ��ȡ���ƺõ��ļ�
		try {
			
			in = new FileInputStream("f:\\javaworkspace\\TestFileOutPutStream555.java");
			
			while( (b = in.read() ) != -1 ) {
				System.out.print( (char)b );
			}
			in.close();
			
		}
		catch(FileNotFoundException e3) {
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}
		catch( IOException e4) {
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}
	}

}
