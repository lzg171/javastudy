package TestUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TestUdpClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] buf = ( new String("hello") ).getBytes() ;//ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte ������
		DatagramPacket dp = new DatagramPacket(buf, buf.length,new InetSocketAddress("192.168.1.104",5688) );//�������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ں�
		DatagramSocket ds = new DatagramSocket(9999);//client�ͻ���ռ����9999�˿ڣ����Դ˶˿ڷ����������ˡ��������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿�
		ds.send(dp);//�Ӵ��׽��ַ������ݱ�����DatagramPacket ��������Ϣָʾ����Ҫ���͵����ݡ��䳤�ȡ�Զ�������� IP ��ַ��Զ�������Ķ˿ں�
		ds.close();
	}

}
