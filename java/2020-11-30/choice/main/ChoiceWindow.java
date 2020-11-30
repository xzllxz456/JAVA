package main;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChoiceWindow extends Frame implements WindowListener{
	
	Choice choice;	// select option Swing  JComboBox<E>
	Label label;
	public ChoiceWindow() {
		setLayout(new FlowLayout());
		
		choice = new Choice();
		choice.add("사과");
		choice.add("귤");
		choice.add("배");
		choice.add("오랜지");
		choice.add("바나나");
		
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText(choice.getSelectedItem());
			}
		});
		add(choice);
		
		label = new Label("---");
		add(label);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
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
