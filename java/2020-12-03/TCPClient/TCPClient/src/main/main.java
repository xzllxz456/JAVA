package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import thread.ClientThread;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 	1. 접속을 해야 할 Server 주소를 설정 = Socket
		 	2. 소켓 생성
		 	3. 접속 
		 	4. 데이터 송수신
		 */
		// Server 주소를 설정
		InetSocketAddress sockAdd = new InetSocketAddress("192.168.0.118", 9000);
		//소켓생성												host name//126,118		server port
		Socket socket = new Socket();
		
		try {
//			socket = new Socket();
			// 접속			어디로갈지	 1/1000초
			socket.connect(sockAdd, 5000);
			InetAddress inetAddr;	// 데이터 정보
			if((inetAddr = socket.getInetAddress()) != null) {
				System.out.println("server 접속 성공: " + inetAddr);
			}else {
				System.out.println("server 연결 실패");
			}
			new ClientThread(socket).start();
			while (true) {
		
				
//				String msg = "오류";
				System.out.print("전송할 문자 입력 : ");
				String msg = sc.next();

				// send
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(msg);
				pw.flush();

				// recv
//				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				msg = br.readLine();
//				System.out.println("다시 받은 메세지 " + msg);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
