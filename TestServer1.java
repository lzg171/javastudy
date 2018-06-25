package TestNet;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket s = new ServerSocket(9999);
			while(true) {
				Socket s1 = s.accept();
				OutputStream os = s1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("hello client,"+s1.getInetAddress()+"port# " +s1.getPort()+"bye-bye");
				dos.close();
				s1.close();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("程序运行出错"+e);
		}
	}

}
