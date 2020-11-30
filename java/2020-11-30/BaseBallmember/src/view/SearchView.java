package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.Imple.DeleteClass;
import dao.Imple.SearchClass;

public class SearchView extends JFrame implements ActionListener{
	JTextField searchName;
	JButton bt;
	public SearchView() {
		super("delete");
		setLayout(null);
		JPanel jp = new JPanel();
		jp.setBounds(0, 0, 300, 40);
		searchName = new JTextField(10);
		jp.add(new JLabel("search"));
		jp.add(searchName);
		bt = new JButton("search");
		jp.add(bt);
		bt.addActionListener(this);
		add(jp);
		
		
		
		setBounds(0, 0, 400, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == bt) {
			SearchClass dc = new SearchClass();
			dc.search(searchName.getText());
			dispose();
		}
	}
	
	
	
}
