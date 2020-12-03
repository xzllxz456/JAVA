import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class threadd extends Thread{
	Socket socket;
	public threadd(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		super.run();
		while (true) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String m = br.readLine();
				System.out.println("서버로 온 메세지 " + m);
				Thread.sleep(300);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		
	}
}
