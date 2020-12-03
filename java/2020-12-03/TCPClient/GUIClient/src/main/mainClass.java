package main;

import java.net.Socket;

import network.ReadThread;
import view.ClientFrame;

public class mainClass {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.0.118", 9000);
		System.out.println("server Connection success!!");
		ClientFrame cf = new ClientFrame(socket);
		new ReadThread(socket, cf).start();
	}
}
