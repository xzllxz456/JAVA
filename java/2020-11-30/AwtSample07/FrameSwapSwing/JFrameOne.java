package FrameSwapSwing;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JFrameOne extends JFrame implements ActionListener{
	JButton btn;
	JButton btn2;
	JPanel panel;
	JPanel panel2;
	public JFrameOne() {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(50, 50, 640, 480);
		panel.setBackground(Color.blue);
		
		btn = new JButton("change");
		btn.setBounds(100, 100, 50, 50);
//		add(btn);
		panel.add(btn);
		
		btn.addActionListener(this);
		add(panel);

		panel2 = new JPanel();
		panel2.setBounds(50, 50, 640, 480);
		panel2.setBackground(Color.GREEN);
		
		btn2 = new JButton("change2");
		btn2.addActionListener(this);
//		add(btn2);
		panel2.add(btn2);
		add(panel2);
				
		setBounds(0, 0, 640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
	//	JOptionPane.showMessageDialog(null, "click");
		
		Object obj = e.getSource();
		JButton bt = (JButton)obj;
		if(bt == btn) {
			add(panel2);
			remove(panel);
		}
		if(bt == btn2) {
			remove(panel2);
			add(panel);
		}
	}
	
}
