package TestUDP;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUdpServer2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		byte buf[] = new byte[1024];		
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length);//���� DatagramPacket���������ճ���Ϊ buf.length �����ݰ�
		DatagramSocket ds = new DatagramSocket(5788);//�������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿� 5688
		while(true) {
			ds.receive(dp);//�Ӵ��׽��ֽ������ݱ���
			//�յ��İ� ת��Ϊ long����
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bais);
			
			System.out.println( dis.readLong() );//ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String
		}
	}

}
