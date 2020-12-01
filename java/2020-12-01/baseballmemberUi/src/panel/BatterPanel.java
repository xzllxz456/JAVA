package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dto.Batter;
import dto.Human;
import sigleton.SingletonCls;
import view.InsertView;
import view.MenuView;

public class BatterPanel extends JPanel{
	InsertView insertV;
	JLabel lable[] = new JLabel[6];
	JTextField textField[] = new JTextField[6];
	
	JButton menuBtn, insertBtn;
	public BatterPanel(InsertView insertV) {
		this.insertV = insertV;
		setLayout(null);
		String title[] = {"이름: ", "나이: ", "신장: ", "친거: ", "안타: ", "타율: "};
		for (int i = 0; i < title.length; i++) {
			lable[i] = new JLabel();
			lable[i].setText(title[i]);
			lable[i].setFont(new Font("돋음",Font.BOLD, 18));
			lable[i].setBounds(30, 50 + 40 * i, 100, 30);
			add(lable[i]);
			
			textField[i] = new JTextField();
			textField[i].setBounds(180, 50 + 40 * i, 200, 30);
			add(textField[i]);
		}
		menuBtn = new JButton("메뉴");
		menuBtn.setBounds(150, 320, 150, 50);
		menuBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertV.dispose();
				new MenuView();
			}
		});
		add(menuBtn);
		insertBtn = new JButton("추가");
		insertBtn.setBounds(320, 320, 150, 50);
		insertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SingletonCls si = SingletonCls.getInstance();
				Human human = null;
				for (int i = 0; i < textField.length; i++) {
					if(textField[i].getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "모두 작성해주세요");
						return;
					}
				}
				String name = textField[0].getText();
				int age = Integer.parseInt(textField[1].getText());
				double height = Double.parseDouble(textField[2].getText());
				int batcount = Integer.parseInt(textField[3].getText());
				int hit = Integer.parseInt(textField[4].getText());
				double hitAvg = Double.parseDouble(textField[5].getText());				
				
				human = new Batter(0, name, age, height, batcount, hit, hitAvg);
				boolean b = si.dao.insert(human);
				if(b == true) {
					JOptionPane.showMessageDialog(null, "성공적으로 추가하였습니다.");
					for (int i = 0; i < textField.length; i++) {
						textField[i].setText("");
					}
				}else {
					JOptionPane.showMessageDialog(null, "추가에 실패했습니다.");
				}
			}
		});
		add(insertBtn);
			
		
		setBounds(0, 0, 640, 450);
		setBackground(new Color(0, 180, 200));
	}
}
