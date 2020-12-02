package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread extends Thread{
	Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
		
	}

	@Override
	public void run() {
		super.run();
		BufferedReader br;
		try {
			while(true) {

				// recv
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.println("다시 받은 메세지 " + msg);
				Thread.sleep(300);
			}
		}catch (IOException e) {
			// TODO: handle exception
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	
}
