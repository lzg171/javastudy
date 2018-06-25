package TestNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is =null;
		OutputStream os = null;
		try {
			Socket s2 = new Socket("192.168.1.101", 8877);
			is = s2.getInputStream();
			os = s2.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("hey");
			
			String s = null;
			if( (s= dis.readUTF() ) != null ) {
				System.out.println(s);
				dos.close();
				dis.close();
				s2.close();
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
