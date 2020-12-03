package Ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import client.client;

public class ChatView extends JFrame{
	JTextField textField;
	JTextArea textArea;
	client cl = null;
	JButton sendBt, closeBt;
	
	public ChatView() {
		super("채팅");
		
		setLayout(null);
		JPanel pl = new JPanel();
		pl.setLayout(null);
//		pl.setVisible(true);
		pl.setBackground(Color.gray);
		pl.setBounds(150, 20, 400,250);
		textArea = new JTextArea();
		textArea.setLineWrap(false);
		textArea.setEditable(false);
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(0, 0, 400,250);
//		scroll.add(textArea);
		pl.add(scroll);
		
		textField = new JTextField();
		textField.setBounds(150, 300, 250, 80);
		add(textField);
		
		sendBt = new JButton("send");
		sendBt.setBounds(400, 300, 80, 80);
		sendBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String msg = textField.getText();
				textArea.append("나 " + msg);
				cl = new client(msg);
				textField.setText("");
			}
		});
		add(sendBt);
		
		closeBt = new JButton("close");
		closeBt.setBounds(490, 300, 80, 80);
		closeBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(closeBt);
		
		
		add(pl);
		setBounds(100, 100, 640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public ChatView(String msg) {
		textArea.append("상대 " + msg);
	}
}
