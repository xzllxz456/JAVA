package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import view.ClientFrame;
import view.Id;

// send
public class WriteClass {
	Socket socket;
	ClientFrame cf;
	
	String id;
	String msg;
	public WriteClass(ClientFrame cf) {
		this.cf = cf;
		this.socket = cf.socket;
		
	}
	
	public void sendMessage() {
		
		try {
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			// 첫번째 전송 -> 대화명 전송
			if(cf.isFirst == true) {
				// 서버 주소 취득
				InetAddress iaddr = socket.getLocalAddress();
				String ip = iaddr.getHostAddress();// IP취득
				id = Id.textF.getText();	//Id클래스에서 대화명 취득
				
				msg = "[" + id + "]" + "님로그인 " + ip;
						// 길동                                   아이피주소
				
				cf.setTitle("접속자 ID: " + id);
				
			}
			// 그 다음부터 전송 -> 채팅 메시지
			else {
				msg = "[" + id + "]" + cf.textF.getText();
			}
			pw.println(msg);
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
