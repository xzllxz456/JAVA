package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import network.WriteClass;
// 대화명 입력
public class Id extends JFrame implements ActionListener{
	public static JTextField textF = new JTextField(8);
	JButton btn;
	ClientFrame cf;
	WriteClass wc;
	public Id(ClientFrame cf, WriteClass wc) {
		this.cf = cf;
		this.wc = wc;
		
		setTitle("대화명 window");
		setLayout(null);
		
		JLabel label = new JLabel("chating name");
		label.setBounds(50, 30, 120, 30);
		add(label);
		
		textF.setBounds(30, 70, 200, 30);
		add(textF);
		
		btn = new JButton("등록");
		btn.setBounds(50, 110, 120, 30);
		btn.addActionListener(this);
		add(btn);
		
		setBounds(200, 200, 300, 250);
		setBackground(Color.green);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		wc.sendMessage();
		
		cf.isFirst = false;
		
		// ClientFrame을 시각화
		cf.setVisible(true);
		// 현재 창은 close
		this.dispose();
	}
}
