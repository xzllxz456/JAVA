package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread{
	
	Socket clientSocket;
	List<Socket> list;
	public ServerThread(Socket clientSocket, List<Socket> list) {
		this.clientSocket = clientSocket;
		this.list = list;
	}

	@Override
	public void run() {
		super.run();
		try {
			while (true) {
				
				// recv
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String msg = br.readLine(); // 실질적으로 packet을 받는 부분
				//			br.close(); 통신이 끊어짐으로 생략
				System.out.println("클라이언트로부터 받은 메세지: " + msg);
				
				// send
				for (int i = 0; i < list.size(); i++) {
					Socket s = list.get(i);
					if(s != clientSocket) {
						PrintWriter pw = new PrintWriter(s.getOutputStream());
						pw.println(msg);
						pw.flush();
					}
				}
				Thread.sleep(500);
			}
		
		}catch (IOException e) {
			// TODO: handle exception
		}catch (InterruptedException e) {
			
		}
	}
	
	
}
