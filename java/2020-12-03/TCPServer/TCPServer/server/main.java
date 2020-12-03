import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		Socket clSocket;
		
		List<Socket> list = new ArrayList<Socket>();
		
		try {
			ServerSocket servSocket = new ServerSocket(9000);
			while (true) {
				System.out.println("접속대기");
				clSocket = servSocket.accept();
				list.add(clSocket);
				
				System.out.println("접속된 Client" + clSocket.getInetAddress() + " port" + 
										clSocket.getPort());
				
				new threadCls(clSocket, list).start();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
