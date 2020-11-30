package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import dao.Imple.InsertClass;

public class InsertView extends JFrame implements ActionListener{
	JTextField name, heigt, age, batcount, hit, hitAvg, win, lose, depece;
	JPanel bu , hu, pi, ba;
	JRadioButton bat, pit;
	Container c;
	JButton b;
	public InsertView() {
		super("insert");
		setLayout(null);
		bu = new JPanel();
		bu.setBounds(0, 0, 300, 40);
		
		pit = new JRadioButton("pit");
		pit.addActionListener(this);
		pit.isSelected();
		bat = new JRadioButton("bat");
		bat.addActionListener(this);
//		add(pit);
//		add(bat);
		bu.add(pit);
		bu.add(bat);
		b = new JButton("next");
		b.addActionListener(this);
		bu.add(b);
		add(bu);
		
		hu = new JPanel();
		hu.setBounds(50, 40, 120, 150);
		name = new JTextField(10);
		heigt = new JTextField(10);
		age = new JTextField(10);
		hu.add(new JLabel("name"));
		hu.add(name);
		hu.add(new JLabel("height"));
		hu.add(heigt);
		hu.add(new JLabel("age"));
		hu.add(age);
		add(hu);

		setBounds(0, 0, 400, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
	
		if(obj == pit) {
			if(pit.isSelected() ) {
				bat.setSelected(false);
				pi = new JPanel();
				pi.setBounds(50, 200, 120, 150);
				win = new JTextField(10);
				lose = new JTextField(10);
				depece = new JTextField(10);
				pi.add(new JLabel("win"));
				pi.add(win);
				pi.add(new JLabel("lose"));
				pi.add(lose);
				pi.add(new JLabel("defence"));
				pi.add(depece);
				add(pi);
				try {
					remove(ba);
				} catch (Exception e2) {
					
				}
				
			}
		}
		if(obj == bat) {
			if(bat.isSelected()) {
				pit.setSelected(false);
				ba = new JPanel();
				ba.setBounds(50, 200, 120, 150);
				batcount = new JTextField(10);
				hit = new JTextField(10);
				hitAvg = new JTextField(10);
				ba.add(new JLabel("batcount"));
				ba.add(batcount);
				ba.add(new JLabel("hit"));
				ba.add(hit);
				ba.add(new JLabel("hitAvg"));
				ba.add(hitAvg);
				add(ba);
				
				try {
					remove(pi);
				} catch (Exception e2) {
				}
			}
		}
		revalidate();
		repaint();
		if(obj == b) {
			if(pit.isSelected()) {
				InsertClass ic = new InsertClass();
				ic.insert(name, heigt, age, win, lose, depece, pit);
				dispose();
			}
			if(bat.isSelected()) {
				InsertClass ic = new InsertClass();
				ic.insert(name, heigt, age, batcount, hit, hitAvg, bat);
				dispose();
			}
		}
	}
	
}
