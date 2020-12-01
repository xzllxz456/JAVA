package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import sigleton.SingletonCls;

public class DeleteView extends JFrame{
	JButton menuBtn, deleteBtn;
	JTextField nameField;
	
	public DeleteView() {
		super("delete");
		setLayout(null);
		JLabel label = new JLabel("삭제");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("바탕", Font.BOLD, 48));
		label.setBounds(200, 30, 200, 50);
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
		
		deleteBtn = new JButton("삭제");
		deleteBtn.setBounds(220, 80, 70, 30);
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SingletonCls si = SingletonCls.getInstance();
				if(nameField.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "작성해주세요");
					return;
				}
				if(si.dao.delete(nameField.getText().trim())) {
					JOptionPane.showMessageDialog(null, "삭제했습니다.");
				}else {
					JOptionPane.showMessageDialog(null, "추가에 실패했습니다.");
				}
//				si.dao.delete(nameField.getText().trim());
			}
		});
		add(deleteBtn);
		
		
		setBounds(0, 0, 640, 480);
//		setBackground(Color.GREEN);
		getContentPane().setBackground(Color.GREEN);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
