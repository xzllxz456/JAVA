package radiobutton2;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class SwingRadio extends JFrame implements ActionListener, ItemListener{
	JRadioButton rb1, rb2, rb3, rb4, rb5;
	JCheckBox exitBtn;
	JLabel lavel1, lavel2;
	public SwingRadio() {
		super("설정");
		setLayout(new FlowLayout());
		
		ButtonGroup bg1 = new ButtonGroup();
		rb1 = new JRadioButton("사과");
		rb2 = new JRadioButton("배");
		rb3 = new JRadioButton("밤");
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
		add(rb1);
		add(rb2);
		add(rb3);
		
		ButtonGroup bg2 = new ButtonGroup();
		rb4 = new JRadioButton("퍼렁");
		rb5 = new JRadioButton("뻘겅");
		bg2.add(rb4);
		bg2.add(rb5);
		add(rb4);
		add(rb5);
		
		exitBtn = new JCheckBox("exit");
		add(exitBtn);
		
		lavel1= new JLabel("label1");
		lavel2 = new JLabel("label2");
		add(lavel1);
		add(lavel2);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		rb4.addActionListener(this);
		rb5.addActionListener(this);
		exitBtn.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Object obj = e.getSource();	// e.getSource(); return 값이 Object
				// Check Box
				if(obj == exitBtn) {
					JCheckBox cb = (JCheckBox) obj;
					if(cb.isSelected()) {	// 체크되었음
						System.exit(0);
					}else {						// 체크안됨
						
					}
				}
				
			}
		});
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == rb1 || obj == rb2 || obj == rb3) {
			JRadioButton cb = (JRadioButton) obj;
			if(cb.isSelected()) {
				String name = cb.getLabel();
				lavel1.setText(name);
			}
		}
		if(obj == rb4 || obj == rb5) {
			JRadioButton cb = (JRadioButton) obj;
			if(cb.isSelected()) {
				lavel2.setText(cb.getLabel());
			}
		}
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
	
	}
	
	
}
