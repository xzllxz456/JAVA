package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.Imple.DeleteClass;

public class DeleteView extends JFrame implements ActionListener{
	JTextField deleteName;
	JButton bt;
	public DeleteView() {
		super("delete");
		setLayout(null);
		JPanel jp = new JPanel();
		jp.setBounds(0, 0, 300, 40);
		deleteName = new JTextField(10);
		jp.add(new JLabel("delete"));
		jp.add(deleteName);
		bt = new JButton("delete");
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
			DeleteClass dc = new DeleteClass();
			dc.delete(deleteName.getText());
			dispose();
		}
		
	}
	
	
	
}
