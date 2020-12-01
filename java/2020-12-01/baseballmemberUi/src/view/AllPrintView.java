package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import dto.Human;
import sigleton.SingletonCls;

public class AllPrintView extends JFrame{
	JTextArea textArea;
	JButton btn1, menuBtn;
	public AllPrintView() {
		setLayout(null);
		textArea = new JTextArea();
		textArea.setBounds(10, 10, 400, 400);
		textArea.setLineWrap(false);
		
		JScrollPane scrPane = new JScrollPane(textArea);
		scrPane.setPreferredSize(new Dimension(400, 300));
		
		JPanel botpan = new JPanel();
		btn1 = new JButton("allprint");
		btn1.setBounds(500, 30, 100, 80);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
//				JOptionPane.showMessageDialog(null, "dddsddd");
				SingletonCls si = SingletonCls.getInstance();
				List<Human> list = si.dao.allprint();
				for (int i = 0; i < list.size(); i++) {
					Human h = list.get(i);
					if(h.getNumber() < 2000) {
						String msg = h.toString();
						System.out.println(msg);
						textArea.append(msg + "\n");
					}else {
						String msg = h.toString();
						textArea.append(msg + "\n");
					}
				}
			}
		});
		
		menuBtn = new JButton("메뉴");
		menuBtn.setBounds(500, 200, 100, 80);
		menuBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MenuView();
			}
		});
		add(menuBtn);
		
		add(btn1);
		add(scrPane);
		add(textArea);
		
		
		setBounds(0, 0, 640, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
