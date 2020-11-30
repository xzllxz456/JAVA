package main;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JRadioButton;

public class WindowTest extends Frame implements ActionListener, WindowListener, ItemListener{
	Checkbox cb1, cb2, cb3, cb4, cb5;
	Label label1, label2;
	JRadioButton radioBtn;
	Checkbox exitCheck;
	public WindowTest() {
		/*
		 	radioButton		AWT는 없다. Swing있다.
		 		선택은 1개	(남자 여자)
		 	Check Box
		 	다중 선택 가능 ex)취미 좋아하는거 
		 */
		
		CheckboxGroup cbg1 = new CheckboxGroup();
		cb1 = new Checkbox("사과", cbg1,	true);
		cb2 = new Checkbox("배", cbg1, false);
		cb3 = new Checkbox("바나나", cbg1, false);
		
		CheckboxGroup cbg2 = new CheckboxGroup();
		cb4 = new Checkbox("빨강", cbg2,	false);
		cb5 = new Checkbox("파랑", cbg2,	false);
		
		exitCheck = new Checkbox("exit");
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(exitCheck);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		exitCheck.addItemListener(this);
		
		label1 = new Label("label1");
		label2 = new Label("label2");
		
		add(label1);
		add(label2);
		
		setLayout(new FlowLayout());
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();	// e.getSource(); return 값이 Object
		// Check Box
		if(obj == exitCheck) {
			Checkbox cb = (Checkbox) obj;
			if(cb.getState() == true) {	// 체크되었음
				System.exit(0);
			}else {						// 체크안됨
				
			}
		}
		
		// RadioButton
		if(obj == cb1 || obj == cb2 || obj == cb3) {
			Checkbox cb = (Checkbox) obj;
			if(cb.getState()) {
				String name = cb.getLabel();
				label1.setText(name);
			}
		}
		if(obj == cb4 || obj == cb5) {
			Checkbox cb = (Checkbox) obj;
			if(cb.getState()) {
				label2.setText(cb.getLabel());
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
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
