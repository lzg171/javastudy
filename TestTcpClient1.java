package TestNet;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestTcpClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.1.105",6666);//������ IPΪ192.168.1.105���˿�Ϊ6666�ķ���������
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("HELLO SERVER");
		dos.close();
		s.close();
	}

}
