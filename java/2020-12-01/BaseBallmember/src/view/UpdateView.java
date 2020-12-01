package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.Imple.UpdateClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class UpdateView extends JFrame implements ActionListener{
	UpdateClass uc = new UpdateClass();
	Human h = null;
	JTextField searchName, batcount, hit, hitAvg, win, lose, depece;
	JButton bt, se;
	public UpdateView() {
		super("update");
		setLayout(null);
		JPanel jp = new JPanel();
		jp.setBounds(0, 0, 300, 100);
		searchName = new JTextField(10);
		jp.add(new JLabel("update"));
		jp.add(searchName);
		se = new JButton("search");
		jp.add(se);
		se.addActionListener(this);
		bt = new JButton("update");
		bt.addActionListener(this);
		jp.add(bt);
	
		add(jp);
		
		
		
		
		
		setBounds(0, 0, 400, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == se) {		
			h = uc.update(searchName.getText());
			type(h);
		}
		if(obj == bt) {	
			if(h instanceof Pitcher) {
				JOptionPane.showMessageDialog(null, "dddsddd");
				uc.update2(win, lose, depece);
			}
			if(h instanceof Batter) {
				JOptionPane.showMessageDialog(null, "dddsddd");
				uc.update2(batcount, hit, hitAvg);
			}
			dispose();
		}
	}
	public void type(Human h) {
		if(h instanceof Pitcher) {
			JPanel hu = new JPanel();
			hu.setBounds(50, 100, 120, 150);
			win = new JTextField(10);
			lose = new JTextField(10);
			depece = new JTextField(10);
			hu.add(new JLabel("win"));
			hu.add(win);
			hu.add(new JLabel("lose"));
			hu.add(lose);
			hu.add(new JLabel("defence"));
			hu.add(depece);
			add(hu);
			
		}
		if(h instanceof Batter) {
			JPanel hu = new JPanel();
			hu.setBounds(50, 100, 120, 150);
			batcount = new JTextField(10);
			hit = new JTextField(10);
			hitAvg = new JTextField(10);
			hu.add(new JLabel("batcount"));
			hu.add(batcount);
			hu.add(new JLabel("hit"));
			hu.add(hit);
			hu.add(new JLabel("hitAvg"));
			hu.add(hitAvg);
			add(hu);
		}
		revalidate();
		repaint();
	}
	
	
}
