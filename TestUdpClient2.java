package TestUDP;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TestUdpClient2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		long n = 1000L;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(n);//��һ�� long ֵ�� 8-byte ֵ��ʽд�����������У���д����ֽڡ����û���׳��쳣��������� written ���� 8
		
		byte[] buf = baos.toByteArray();//����һ���·���� byte ���顣���С�Ǵ�������ĵ�ǰ��С�����һ���������Ч�����Ѹ��Ƶ���������
		
		//System.out.println(buf.length);
	
		DatagramPacket dp = new DatagramPacket(buf, buf.length,new InetSocketAddress("192.168.1.104",5788) );//�������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ں�
		DatagramSocket ds = new DatagramSocket(9900);//client�ͻ���ռ����9999�˿ڣ����Դ˶˿ڷ����������ˡ��������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿�
		ds.send(dp);//�Ӵ��׽��ַ������ݱ�����DatagramPacket ��������Ϣָʾ����Ҫ���͵����ݡ��䳤�ȡ�Զ�������� IP ��ַ��Զ�������Ķ˿ں�
		ds.close();
		
	}
}
