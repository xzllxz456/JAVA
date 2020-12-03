package client;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

import Ui.ChatView;

public class client extends Thread{
	InetSocketAddress sockAddr;
	Socket socket;
	String msg = "";
	PrintWriter pw;
	public client() {
		new ChatView();
		sockAddr = new InetSocketAddress("192.168.0.118", 9000);
		socket = new Socket();
		
		try {
			socket.connect(sockAddr, 5000);
			if(socket.getInetAddress() != null) {
				System.out.println("접속 성공 : " + socket.getInetAddress());
			}else {
				System.out.println("연결실패");
			}
		
			new threadc(socket).start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public client(String m) {
			
			this.msg = m;
			
			try {
				pw = new PrintWriter(this.socket.getOutputStream());
				pw.println(msg);
				pw.flush();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

//		PrintWriter pw;
		

		
//		try {
////			pw = new PrintWriter(socket.getOutputStream());
////			pw.println(msg);
////			pw.flush();
//			PrintWriter pw = new PrintWriter(socket.getOutputStream());
//			pw.println(msg);
//			pw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
