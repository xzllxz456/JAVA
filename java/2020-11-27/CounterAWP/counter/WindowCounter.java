package counter;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class WindowCounter extends Frame implements WindowListener, ActionListener {

	Label countLabel;
	Label label;
	Integer count = 0;
	
	Button plButt;
	Button minerButt;
	Button resetB;
	
	public WindowCounter() {
		setLayout(null);
		
		countLabel = new Label("카운터");
		countLabel.setBounds(250, 50, 250, 100);
		countLabel.setBackground(Color.red);
		
		add(countLabel);
		
		label = new Label("0");
		label.setBounds(250, 200, 250, 100);
		label.setBackground(Color.YELLOW);
		add(label);
		
		plButt = new Button();
		plButt.setLabel("+");
		plButt.setBounds(250, 350, 120, 120);
		plButt.addActionListener(this);
		add(plButt);
		
		
		minerButt = new Button();
		minerButt.setLabel("-");
		minerButt.setBounds(400, 350, 120, 120);
		minerButt.addActionListener(this);
		add(minerButt);
		
		resetB = new Button();
		resetB.setLabel("reset");
		resetB.setBounds(250, 500, 250, 100);
		resetB.addActionListener(this);
		add(resetB);
		
		
		
		setBounds(100, 200, 600, 1000);
		setBackground(Color.GREEN);
		
		setVisible(true);
		addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		if(btnTitle.equals("+")) {
//			JOptionPane.showMessageDialog(null, "+");
			label.setText((Integer.parseInt(label.getText()) + 1) + "");
		}else if(btnTitle.equals("-")) {
//			JOptionPane.showMessageDialog(null, "-");
			label.setText((Integer.parseInt(label.getText()) - 1) + "");
		}else if(btnTitle.equals("reset")) {
			JOptionPane.showMessageDialog(null, "reset");
			label.setText("0");
		}
		*/
		if (e.getSource() instanceof Button) {
			switch (((Button)e.getSource()).getLabel()) {
			case "+":
				count++;
				label.setText(String.valueOf(count));
				break;
			case "-":
				count--;
				label.setText(String.valueOf(count));
				break;
			case "reset":
				count = 0;
				label.setText(String.valueOf(count));
				break;	
			}
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



}
