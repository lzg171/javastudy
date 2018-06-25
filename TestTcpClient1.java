package TestNet;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestTcpClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.1.105",6666);//申请与 IP为192.168.1.105，端口为6666的服务器连接
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("HELLO SERVER");
		dos.close();
		s.close();
	}

}
