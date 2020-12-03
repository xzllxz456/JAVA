package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import thread.ServerThread;

public class main {
	public static void main(String[] args) {
		/*
		  	TCP : Transmission Control Protocol
		  			  전송		   제어	 통신규약 
		 
		 	TCP server : 
		 		Web server(Tomcat) : 
		 		DB  server : 
		 	
		 	종단 System : 	host 안주인
		 				PC, Printer, Smart Phone, Scanner
		 							client : 사용자
		 							
		 	Router - hardware
		 			 host들 간에 상호 데이터를 교환할 수 있도록 하는 기기
		 			 
		 	Inter Network	포괄적인 통신망
		 	
		 	Protocol - 통신규약 
		 	TCP : Transmission Control Protocol
		 			신사적인 프로토콜 신뢰할수 있는 프로토콜
		 			전화 ---> 상대방 통신 시작(상대방이 받아야 1:1로 주고 받아야 함)
		 			연결이 되어야지 통신을 할수 있어 신용할수 있다
		 			데이터의 경계가 없다, 전송데이터의 크기가 한정되어 있지 않다. 
		 			UDP 보다 느림<채팅>
		 			1:1 통신 uni cast
		 			
		 	UDP : User Datagram Protocol
		 			비연결형
		 			편지 ---> (일단 보내고 끝 보내고 확인 안함) 지상파 방송
		 			데이터의 경계가 있다.(크기를 정해야한다-> 얼마나 보낼지 모름)
		 			전송속도 빠름<게임>
		 			1 : 1  통신	uni cast
		 			1 : n 통신	board cast
		 			n : n 통신	multi cast
		 			
		 	7 Layer(계층)
		 	1계층 - Physical Layer 	물리계층
		 	2계층 - Data Link Layer	주소를 헤더에 첨
		 	3계층 - Network Layer 	Ip == Address 
		 	4계층 - Tranceport Layer	Port 지정
		 	5계층 - Session Layer		세션을 동기화
		 	6계층 - Presentation Layer	보안, 압축, 확장
		 	7계층 - Application Layer 프로그램
		 	
		 	Packet(데이터의 묶음) Packet을 서버로 던짐
		 	제어 정보, 데이터 등이 결합된 형태로 전송되는 실제의 데이터
		 	TCP/UDP, IP, Port, String, Object
		 	
		 	IP : Internet Protocol == 주소
		 	
		 	IPv4 : 0 ~ 255의 숫자가 4묶음  XXX.XXX.XXX.XXX
		 	IPv6 : 					  XXX.XXX.XXX.XXX.XXX.XXX
		 	
		 	자기 자신의 접속 IP : 127.0.0.1 자기 자신 접속
		 	
		 	Port Number = 프로그램의 주소 번호 4자리
		 	IP 주소는 Internet에 존재하는 host(PC)를 식별할 수 있으나
		 	최종 주체인 Process(프로그램(카톡,...))를 식별하지 못하기 때문에 
		 	프로세스를 구별하기 위해서 지정된 Number(0~1024는 system이 사용)
		 	1024부터 사용가능
		 	
		 	Soket(윈도우 통신)  <---  유닉스(file(write, read) 통신) 네트워크가 원조
		 	통신을 하기 위한 주체(Object)
		 	IP, Port, TCP/UDP
		 	
		 	통신 순서 
		 	
		 	Server	1~5 initializer초기화		Client
		 1. Soket 버전 확인				1. Soket버전 확인
		 2. Soket 생성					2. Socket 설정
		 3. IP, Port설정(binding)				
		 4. listen
		 5. accept접속		<------		3. connet연결
		 					접속 성공
		 6. Paket(데이터)의 송수신
		 	recv(receive)	<------		send
		 	send			------>		recv
		 */
		
		Socket clientSocket = null;
		
		List<Socket> list = new ArrayList<Socket>();
		try {
			// 문지기 소켓								  port
			ServerSocket servSoket = new ServerSocket(9000);
			// ServerSocket에 IP, Port, binding, listen 다포함
			while (true) {
				
				System.out.println("접속 대기중...");
				clientSocket = servSoket.accept();	// accept에 걸쳐있다.
				
				list.add(clientSocket);
				/*
			  		Socket clientSocket: 접속된 소켓의 정보를 갖고 있는 Socket
			    	담당자 소켓
				 */
				System.out.println("접속된 Client의 정보: " + clientSocket.getInetAddress() + 
						" Port : " + clientSocket.getPort());

				new ServerThread(clientSocket, list).start();
				
				/*
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String msg = br.readLine(); // 실질적으로 packet을 받는 부분
				//			br.close(); 통신이 끊어짐으로 생략
				System.out.println("클라이언트로부터 받은 메세지: " + msg);

				PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
				pw.println(msg);
				pw.flush();
				*/
//				clientSocket.close();
//				servSoket.close();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}