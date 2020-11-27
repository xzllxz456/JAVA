package WindowTest;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		
		// Layout
//		setLayout(new FlowLayout());		// 일열로 나열
//		setLayout(new GridLayout(3, 1));	// 쪼게서 사용	많이 사용 쪼갠게 같은비율로 줄어듬
		setLayout(null);
		
		
		// Label
		Label label = new Label();
		label.setText("Lable");
		label.setBackground(Color.green);
		label.setBounds(150, 30, 50, 100);
		add(label); 	// Frame 추가
		
		Label label1 = new Label("레이블입니다.");
		label1.setBackground(Color.BLUE);
		label1.setBounds(150, 300, 70, 100);
		add(label1);
		
		Button button = new Button();
		button.setLabel("버튼");
		button.setBackground(Color.pink);
		button.setBounds(150, 600, 100, 100);
		add(button);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox ck = new Checkbox("음메메메에에");
		ck.setBounds(100,50, 100,100);
	    Checkbox ck2 = new Checkbox("dsada", cbg,false);
	    ck2.setBounds(100,40, 100,900);   
	    Checkbox ck3 = new Checkbox("Java", cbg, false);
	    ck3.setBounds(600, 30, 100, 100);
	    add(ck);
	    add(ck2);
	    add(ck3);
		
		
		
//		setSize(640, 480);
//		setLocation(100, 100);
		setTitle("dsadsadasdasda");
		setBounds(50,50, 1000,1000);
		
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
