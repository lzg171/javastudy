package TestUDP;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUdpServer2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		byte buf[] = new byte[1024];		
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length);//构造 DatagramPacket，用来接收长度为 buf.length 的数据包
		DatagramSocket ds = new DatagramSocket(5788);//创建数据报套接字并将其绑定到本地主机上的指定端口 5688
		while(true) {
			ds.receive(dp);//从此套接字接收数据报包
			//收到的包 转换为 long的数
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bais);
			
			System.out.println( dis.readLong() );//通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String
		}
	}

}
