import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class threadCls extends Thread{
	Socket socket;
	List<Socket> list;
	
	public threadCls(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		
		BufferedReader br;
		try {
			while (true) {

				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String m = br.readLine();
				System.out.println("클라에서 온 글귀 : " + m);

				for (int i = 0; i < list.size(); i++) {
					Socket s;
					if(list.get(i) != socket) {
						PrintWriter pw = new PrintWriter(list.get(i).getOutputStream());
						pw.println(m);
						pw.flush();
					}
				}
				Thread.sleep(400);
			}
		} catch (Exception e) {
			System.out.println("연결이 끊긴 IP: " + socket.getInetAddress());
			
			list.remove(socket);
			for (Socket soc : list) {
				System.out.println("접속이 되어있는 IP" + soc.getInetAddress() + "port : " + 
											soc.getPort());
			}
			try {
				socket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
	}
}
