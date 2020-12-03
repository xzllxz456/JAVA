package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// 채팅창

import network.WriteClass;
public class ClientFrame extends JFrame implements ActionListener{
	public Socket socket;
	public JTextField textF = new JTextField(24);
	public JTextArea textA = new JTextArea();
	
	JButton btnTrancefer = new JButton("send");
	JButton btnExit = new JButton("exit");
	
	JPanel panel = new JPanel();
	
	WriteClass wc;	// 전송 클래스
	
	// 서버로 처음 전송 인지
	public boolean isFirst = true;
	
	public ClientFrame(Socket socket) {
		super("chatting");
		this.socket = socket;
		
		wc = new WriteClass(this);
		new Id(this, wc);
		
		JScrollPane scrollPane = new JScrollPane(textA);
		scrollPane.setPreferredSize(new Dimension(200, 120));
		add("Center", scrollPane);
		
		panel.add(textF);
		panel.add(btnTrancefer);
		panel.add(btnExit);
		
		add("South", panel);
		
		btnTrancefer.addActionListener(this);
		btnExit.addActionListener(this);
		
		setBounds(200, 200, 450, 600);
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		if(obj == btnTrancefer) {
			if(textF.getText().trim().equals("")) return;
			String id = Id.textF.getText();
			
			// textArea에 추가
			textA.append("[" + id + " ] " + textF.getText() + "\n");
			
			// server send
			wc.sendMessage();
			textF.setText("");
		}else if(obj == btnExit) {
			System.exit(0);
			
		}
	}
	
}
