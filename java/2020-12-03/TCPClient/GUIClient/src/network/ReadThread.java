package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import view.ClientFrame;

// recv
public class ReadThread extends Thread{
	
	Socket socket;
	ClientFrame cf;
	
	public ReadThread(Socket socket, ClientFrame cf) {
		this.socket = socket;
		this.cf = cf;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str = br.readLine();
				if(str == null) {
					System.out.println("접속 끊김");
				}

				cf.textA.append(str + "\n");
				Thread.sleep(300);
			}
			
		} catch (Exception e) {
		}
		
	}
}
