package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dto.Human;
import sigleton.SingletonCls;

public class SelectView extends JFrame{
	JButton menuBtn, searchBtn;
	JTextField nameField;
	JTextArea nameArea;
	public SelectView() {
		super("select");
		setLayout(null);
		
		nameArea = new JTextArea();
		nameArea.setBounds(100, 150, 300, 250);
		add(nameArea);
		
		JLabel label = new JLabel("선수찾기");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("바탕", Font.BOLD, 48));
		label.setBounds(200, 30, 250, 50);
		add(label);
		
		nameField = new JTextField();
		nameField.setBounds(100, 80, 100, 30);
		add(nameField);
		
		menuBtn = new JButton("메뉴");
		menuBtn.setBounds(300, 80, 70, 30);
		menuBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MenuView();
			}
		});
		add(menuBtn);
		
		
		searchBtn = new JButton("검색");
		searchBtn.setBounds(220, 80, 70, 30);
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SingletonCls si = SingletonCls.getInstance();
				if(nameField.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "작성해주세요");
					return;
				}
				List<Human> hu = si.dao.select((nameField.getText().trim()));
				if(hu.size() != 0) {
					JOptionPane.showMessageDialog(null, "찾았습니다.");
					for (int i = 0; i < hu.size(); i++) {
						nameArea.append(hu.get(i).toString() + "\n");
					}
				}else {
					JOptionPane.showMessageDialog(null, "찾는데 실패했습니다.");
				}
//				si.dao.delete(nameField.getText().trim());
			}
		});
		add(searchBtn);
	
		
		setBounds(0, 0, 640, 480);
//		setBackground(Color.GREEN);
		getContentPane().setBackground(Color.GREEN);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
