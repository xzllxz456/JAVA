package Number;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowJFram extends JFrame{
	Button btn;
	int j = 1;
	int row;
	
	public WindowJFram() {
		super("gggggggggggggg");
		
		setLayout(null);
		
		ArrayList<Button> list = new ArrayList<Button>();
		
		JPanel bpanel = new JPanel();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				list.add(new Button(((3*i + j)+1) + ""));
				if((3*i + j) / 3 < 9) {
					list.get(3*i + j).setBounds((j * 60) + 80 , (i*60) + 80  + 50, 50, 50);
					add(list.get(i));
				}
			}
		}
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
}
