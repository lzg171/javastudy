package TestNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		try {
			ServerSocket ss =new ServerSocket(8877);
			Socket s2 = ss.accept();
			in = s2.getInputStream();
			out = s2.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			String s = null;
			if( ( s = dis.readUTF() ) != null ) {
				System.out.println(s);
				System.out.println("from: "+s2.getInetAddress() );
				System.out.println("port: "+s2.getPort() );
			}
			dos.writeUTF("hi,hello");
			dis.close();
			dos.close();
			s2.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
