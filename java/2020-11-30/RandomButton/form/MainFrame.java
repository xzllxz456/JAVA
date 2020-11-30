package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements ActionListener{
	JButton button[] = null;
	
	int randomNum;
	
	public MainFrame(int count) {
		super("main");
//		JOptionPane.showMessageDialog(null, count+"");
		setLayout(null);
		randomNum = (int)(Math.random() * count) + 1;
		JOptionPane.showMessageDialog(null, randomNum+"");
		button = new JButton[count];
		int x = 0;
		int y = 0;
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton((i + 1)+"");
			button[i].setBounds(160 + (x*90), 150+ (y * 90), 80, 80);
			button[i].addActionListener(this);
			add(button[i]);
			if(i % 3 == 2) {
				y++;
			}
			if(x == 2) {
				x = 0;
			}else {
				x++;
			}
		}
		
		setBounds(200, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 따로끄기ㄴ
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String btnNum = btn.getLabel();
		for (int i = 0; i < button.length; i++) {
			if(btnNum.equals((i+1) + "")) {
//				JOptionPane.showMessageDialog(null, (i+1) + "버튼클릭");
				if (randomNum == (i+1)) {
					JOptionPane.showMessageDialog(null, "당첨");
					this.dispose();
					new ButtonConfig();
				}else {
					// 버튼 비활성화
//					button[i].setEnabled(false);
					// 버튼 삭제
					button[i].setVisible(false);
				}
				
			}
		}
		
	}
}
