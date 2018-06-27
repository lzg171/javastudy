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
		dos.writeLong(n);//将一个 long 值以 8-byte 值形式写入基础输出流中，先写入高字节。如果没有抛出异常，则计数器 written 增加 8
		
		byte[] buf = baos.toByteArray();//创建一个新分配的 byte 数组。其大小是此输出流的当前大小，并且缓冲区的有效内容已复制到该数组中
		
		//System.out.println(buf.length);
	
		DatagramPacket dp = new DatagramPacket(buf, buf.length,new InetSocketAddress("192.168.1.104",5788) );//构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号
		DatagramSocket ds = new DatagramSocket(9900);//client客户端占据了9999端口，并以此端口发至服务器端。创建数据报套接字并将其绑定到本地主机上的指定端口
		ds.send(dp);//从此套接字发送数据报包。DatagramPacket 包含的信息指示：将要发送的数据、其长度、远程主机的 IP 地址和远程主机的端口号
		ds.close();
		
	}
}
