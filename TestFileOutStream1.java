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
			System.out.println("找不到指定文件");
			System.exit(-1);
		}
		catch( IOException e1) {
			System.out.println("文件复制错误");
			System.exit(-1);
		}
		System.out.println("文件已经复制");
		
		//以下程序段是 读取复制好的文件
		try {
			
			in = new FileInputStream("f:\\javaworkspace\\TestFileOutPutStream555.java");
			
			while( (b = in.read() ) != -1 ) {
				System.out.print( (char)b );
			}
			in.close();
			
		}
		catch(FileNotFoundException e3) {
			System.out.println("找不到指定文件");
			System.exit(-1);
		}
		catch( IOException e4) {
			System.out.println("文件读取错误");
			System.exit(-1);
		}
	}

}
