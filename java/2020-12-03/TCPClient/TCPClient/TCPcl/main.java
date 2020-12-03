import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		InetSocketAddress sockAddr = new InetSocketAddress("192.168.0.118", 9090);
		Socket socket = new Socket();
		
		try {
			socket.connect(sockAddr, 5000);
			if(socket.getInetAddress() != null) {
				System.out.println("서버연결 성공: " + socket.getInetAddress());
			}else {
				System.out.println("실패");
			}
			Scanner sc = new Scanner(System.in);
			new threadd(socket).start();
			while (true) {
				System.out.print("문자입력: " );
				String m = sc.next();
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(m);
				pw.flush();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
