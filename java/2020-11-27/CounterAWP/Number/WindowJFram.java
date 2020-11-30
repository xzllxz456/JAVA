package Number;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WindowJFram extends JFrame implements ActionListener{
	JButton btn;
	JButton reset;
	int row;
	int rnum;
	
	ArrayList<JButton> list = new ArrayList<JButton>();;
 	public WindowJFram() {
		super("gggggggggggggg");
		
		setLayout(null);
		
		creatButton();
		resetButton();
		
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 3; j++) {
//				list.add(new JButton(((3*i + j)+1) + ""));
//				if((3*i + j) / 3 < 9) {
//					list.get(3*i + j).setBounds((j * 60) + 80 , (i*60) + 80  + 50, 50, 50);
//					JButton ptrButton = list.get(3*i + j);
//					ptrButton.addActionListener(this);
//					add(list.get(i));
//				}
//			}
//		}
		
//		for (int i = 0; i < 9;i++) {
//			row = i;
//			for (int k = 0; k < 1; k++) {
//				list.add(new Button(((i + 1)) + ""));
//				if(((i / 3) = 0) {
//					list.get(i).setBounds((row * 60) + 80 , (j*60) + 80  + 50, 50, 50);
//					add(list.get(i));
//				}else {
//					j++;
//				}
//			}
		
		setBounds(100, 100, 600, 900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
 	
 	public void creatButton() {
 		
 		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				list.add(new JButton(((3*i + j)+1) + ""));
				if((3*i + j) / 3 < 9) {
					list.get(3*i + j).setBounds((j * 60) + 80 , (i*60) + 80  + 50, 50, 50);
					JButton ptrButton = list.get(3*i + j);
					ptrButton.addActionListener(this);
					add(list.get(i));
				}
			}
		}

		
		
		
	
	}
 	
 	public void resetButton() {
 		rnum = (int)(Math.random()*9) + 1;
 		reset = new JButton("reset");
		reset.setBounds(80, 320, 170, 80);
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(true);
				if(btn.getText().equals("reset")){
		 			JOptionPane.showMessageDialog(null, "reset되었습니다.");
		 			rnum = (int)(Math.random()*9) + 1;
		 			for (int i = 0; i < list.size(); i++) {
//		 				list.get(i).setEnabled(true);
		 				list.get(i).setVisible(true);
//		 				list.remove(i);
					}
		 		}
				
			}
		});
		add(reset);
	}
 	@Override
 	public void actionPerformed(ActionEvent e) {
 		JButton btn = (JButton) e.getSource();
 		int value = Integer.parseInt(btn.getText());
 		if(value != rnum) {
// 			btn.setEnabled(false);
 			btn.setVisible(false);
 			JOptionPane.showMessageDialog(null, "틀렸습니다.");
 		}else {
// 			btn.setEnabled(true);
 			btn.setVisible(false);
 			JOptionPane.showMessageDialog(null, "맞았습니다.");
		}
 		
 		
 	}



}