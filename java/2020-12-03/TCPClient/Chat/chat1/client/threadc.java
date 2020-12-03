package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import Ui.ChatView;

public class threadc extends Thread{
	Socket socket;
	String m;
	public threadc(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		super.run();
		while(true) {
			try {
				// recv
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.println("다시 받은 메세지 " + msg);
				m = msg;
				new ChatView(msg);
				Thread.sleep(300);
			}catch (IOException e) {
				// TODO: handle exception
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
