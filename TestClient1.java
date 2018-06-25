package TestNet;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TestClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s1 = new Socket("192.168.1.101", 9999);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println( dis.readUTF() );
			dis.close();
			s1.close();
		}catch(ConnectException connEx) {
			connEx.printStackTrace();
			System.out.println("服务器连接失败");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
