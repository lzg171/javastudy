package TestUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUdpServer1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		byte buf[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);//���� DatagramPacket���������ճ���Ϊ buf.length �����ݰ�
		DatagramSocket ds = new DatagramSocket(5688);//�������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿� 5688
		while(true) {
			ds.receive(dp);//�Ӵ��׽��ֽ������ݱ���
			System.out.println( new String(buf,0,dp.getLength() ) );//ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String
		}
	}

}
