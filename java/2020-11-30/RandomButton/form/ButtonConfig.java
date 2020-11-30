package form;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class ButtonConfig extends Frame implements WindowListener, ActionListener{
	TextField tf;
	Button setBtn, startbtn;
	int buttonCount;
	
	public ButtonConfig() {
		super("설정");
		setLayout(null);
		
		buttonCount = 2;
		Label label = new Label("Button Count");
		label.setBounds(30, 30, 240, 30);
		add(label);
		
		tf = new TextField("2");
		tf.setBounds(30, 80, 240, 20);
		add(tf);
		
		setBtn = new Button("set");
		setBtn.setBounds(30, 120, 100, 30);
		setBtn.addActionListener(this);
		add(setBtn);
		
		startbtn = new Button("start");
		startbtn.setBounds(160, 120, 100, 30);
		startbtn.addActionListener(this);
		add(startbtn);
		
		setSize(320, 240);
		setLocation(100, 100);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		String btnLabel = btn.getLabel();
		
		if(btnLabel.equals("set")) {
			buttonCount = Integer.parseInt(tf.getText());
//			JOptionPane.showMessageDialog(null, tf.getText());
		}
		else if(btnLabel.equals("start")) {
			this.dispose();
			buttonCount = Integer.parseInt(tf.getText());
			new MainFrame(buttonCount);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
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
