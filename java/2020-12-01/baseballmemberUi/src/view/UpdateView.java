package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import sigleton.SingletonCls;

public class UpdateView extends JFrame{
	JButton menuBtn, searchBtn, updateBtn;
	JButton switchBtn;
	JTextField nameField;
	JTextArea nameArea;
	Human h;
	JPanel pitPanel, batJPanel;
	
	JPanel contentPanel;
	JTextField textField[];
	JLabel label[];
	
	public UpdateView() {
		super("update");
			setLayout(null);
		JLabel label = new JLabel("수정");
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
		
//		System.out.println(this.getClass().getName());
		
		switchBtn = new JButton("스위치");
		switchBtn.setBounds(380, 80, 70, 30);
		switchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPanel.setVisible(true);
				
				SingletonCls si = SingletonCls.getInstance();
				h = si.dao.Update(nameField.getText().trim());
				
				setLabelText(h);
				
				revalidate();
				repaint();
				
			}
		});
		add(switchBtn);
		
		updateBtn = new JButton("수정");
		updateBtn.setBounds(215, 80, 70, 30);
		updateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField[0].getText().equals("") || textField[1].getText().equals("")||textField[2].getText().equals("")) {
					JOptionPane.showMessageDialog(null, "입력해주세요");
					return;
				}
				SingletonCls si = SingletonCls.getInstance();
				if(h instanceof Pitcher) {
					((Pitcher)h).setWin(Integer.parseInt(textField[0].getText()));
					((Pitcher)h).setLose(Integer.parseInt(textField[1].getText()));
					((Pitcher)h).setDefence(Double.parseDouble(textField[2].getText()));
				}else {
					((Batter)h).setBatcount(Integer.parseInt(textField[0].getText()));
					((Batter)h).setHit(Integer.parseInt(textField[1].getText()));
					((Batter)h).setHitAvg(Double.parseDouble(textField[2].getText()));
				}
				si.dao.inUpdate(h);
				for (int i = 0; i < textField.length; i++) {
					textField[i].setText("");
				}
			}
		});
		add(updateBtn);
//		searchBtn = new JButton("찾기");
//		searchBtn.setBounds(220, 80, 70, 30);
//		searchBtn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				SingletonCls si = SingletonCls.getInstance();
//				if(nameField.getText().trim().equals("")) {
//					JOptionPane.showMessageDialog(null, "작성해주세요");
//					return;
//				}
//				
//				h = si.dao.Update(nameField.getText().trim());
//				pitPanel.remove(1);
//				if(h instanceof Pitcher) {
//					JOptionPane.showMessageDialog(null, "찾았습니다.");
//					pitcher();
//					
//				}else if(h instanceof Batter) {
//					JOptionPane.showMessageDialog(null, "찾았습니다.");
//					batter();
//					remove(pitPanel);
//				}else {
//					JOptionPane.showMessageDialog(null, "추가에 실패했습니다.");
//				}
//				revalidate();
//				repaint();
//			}
//		});
//		
//		add(searchBtn);
		
		contentPanel = new JPanel();
		contentPanel.setLayout(null);
		createContentPanel();
		contentPanel.setVisible(false);
		
		setBounds(0, 0, 640, 480);
//		setBackground(Color.GREEN);
		getContentPane().setBackground(Color.GREEN);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setLabelText(Human human) {
		String title[];
		if(human instanceof Pitcher) {
			title = new String[]{"승: ", "패: ", "방어률: "};
		} else {
			title = new String[]{"친거: ", "안타: ", "타율: "};
		}
		
		for (int i = 0; i < title.length; i++) {
			label[i].setText(title[i]);
		}
	}
	
	public void createContentPanel() {
		label = new JLabel[3];
		textField = new JTextField[3];
		contentPanel.setBounds(100, 150, 400, 250);
		contentPanel.setBackground(Color.yellow);
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel();
			label[i].setFont(new Font("돋음",Font.BOLD, 18));
			label[i].setBounds(30, 50 + 40 * i, 100, 30);

			contentPanel.add(label[i]);
			
			textField[i] = new JTextField(28);
			textField[i].setBounds(180, 50 + 40 * i, 200, 30);
			contentPanel.add(textField[i]);
		}
		
		add(contentPanel);
	}
	/*
	public void pitcher() {
		
		JLabel lable[] = new JLabel[3];
		JTextField textField[] = new JTextField[3];
		contentPanel.setBounds(100, 150, 400, 250);
		contentPanel.setBackground(Color.yellow);
		
		
		String title[] = {"승: ", "패: ", "방어률: "};
		for (int i = 0; i < title.length; i++) {
			lable[i] = new JLabel();
			lable[i].setText(title[i]);
			lable[i].setFont(new Font("돋음",Font.BOLD, 18));
			lable[i].setBounds(30, 50 + 40 * i, 100, 30);

			contentPanel.add(lable[i]);
			
			textField[i] = new JTextField(28);
			textField[i].setBounds(180, 50 + 40 * i, 200, 30);
			contentPanel.add(textField[i]);
		}
		
		add(contentPanel);
		
	}
	public void batter() {
		JLabel lable[] = new JLabel[3];
		JTextField textField[] = new JTextField[3];
		contentPanel.setBounds(100, 150, 400, 250);
		contentPanel.setBackground(Color.yellow);
		
		
		
		String title[] = {"친거: ", "안타: ", "타율: "};
		for (int i = 0; i < title.length; i++) {
			lable[i] = new JLabel();
			lable[i].setText(title[i]);
			lable[i].setFont(new Font("돋음",Font.BOLD, 18));
			lable[i].setBounds(30, 50 + 40 * i, 100, 30);

			contentPanel.add(lable[i]);
			
			textField[i] = new JTextField(28);
			textField[i].setBounds(180, 50 + 40 * i, 200, 30);
			contentPanel.add(textField[i]);
		}
		add(contentPanel);
	}
	*/
	
}
