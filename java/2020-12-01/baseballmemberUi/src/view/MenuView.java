package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import sigleton.SingletonCls;

public class MenuView extends JFrame implements ActionListener{

	JButton button[] = null;
	
	public MenuView() {
		super("menu");
		setLayout(null);
		
		JLabel label = new JLabel("Menu");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("바탕", Font.BOLD, 48));
		label.setBounds(200, 30, 200, 50);
		add(label);
		
		String btnTitle[] = {"insert", "delete", "search", "update", "save", "allPrint"};
		button = new JButton[btnTitle.length];
		for (int i = 0; i < btnTitle.length; i++) {
			button[i] = new JButton(btnTitle[i]);
			button[i].setBounds(180, 120 + 60*i, 260, 50);
			button[i].addActionListener(this);
			add(button[i]);
		}
		
		
		setBounds(0, 0, 640, 600);
		setBackground(Color.green);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn == button[0]) {		// 추가
			new InsertView();	
			this.dispose();
		}else if(btn == button[1]) {	// 삭제
			new DeleteView();
		}else if(btn == button[2]) {
			new SelectView();
		}else if(btn == button[3]) {
			new UpdateView();
		}else if(btn == button[4]) {
			button[4].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					SingletonCls si = SingletonCls.getInstance();
					si.dao.dataSave();
					JOptionPane.showMessageDialog(null, "저장");
				}
			});
		}else if(btn == button[5]) {
			new AllPrintView();
		}
		
	}

}
