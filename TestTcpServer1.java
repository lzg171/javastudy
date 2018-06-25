package TestNet;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTcpServer1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(6666);//创建绑定到特定端口 8888 的服务器套接字
		while(true) {
			Socket s = ss.accept();//侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println( dis.readUTF() );//从流 in 中读取用 UTF-8 修改版格式编码的 Unicode 字符格式的字符串；然后以 String 形式返回此字符串
			
			System.out.println("A client connect !");
		}
		
	}

}
