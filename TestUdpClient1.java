package TestUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TestUdpClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] buf = ( new String("hello") ).getBytes() ;//使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
		DatagramPacket dp = new DatagramPacket(buf, buf.length,new InetSocketAddress("192.168.1.104",5688) );//构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号
		DatagramSocket ds = new DatagramSocket(9999);//client客户端占据了9999端口，并以此端口发至服务器端。创建数据报套接字并将其绑定到本地主机上的指定端口
		ds.send(dp);//从此套接字发送数据报包。DatagramPacket 包含的信息指示：将要发送的数据、其长度、远程主机的 IP 地址和远程主机的端口号
		ds.close();
	}

}
