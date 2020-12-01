package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dto.Human;
import singleton.SingletonClass;

public class AllPrintView extends JFrame{
	JTextArea textArea;
	JButton btn1;
	
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
				JOptionPane.showMessageDialog(null, "dddsddd");
				SingletonClass si = SingletonClass.getInstance();
				for (int i = 0; i < si.getList().size(); i++) {
					Human h = si.getList().get(i);
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
		add(btn1);
		add(scrPane);
		add(textArea);
		
		
		setBounds(100, 100, 640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
}
