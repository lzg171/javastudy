package TestNet;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTcpServer1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(6666);//�����󶨵��ض��˿� 8888 �ķ������׽���
		while(true) {
			Socket s = ss.accept();//���������ܵ����׽��ֵ����ӡ��˷��������Ӵ���֮ǰһֱ����
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println( dis.readUTF() );//���� in �ж�ȡ�� UTF-8 �޸İ��ʽ����� Unicode �ַ���ʽ���ַ�����Ȼ���� String ��ʽ���ش��ַ���
			
			System.out.println("A client connect !");
		}
		
	}

}
