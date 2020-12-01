package dao.Imple;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import dto.Batter;
import dto.Pitcher;
import singleton.SingletonClass;

public class InsertClass {
	private int memberNumber = 0;
	
	public InsertClass() {
		SingletonClass si = SingletonClass.getInstance();

		// list의 마지막 선수의 번호
		if(si.getList().size() > 0) {
			memberNumber = si.getList().get( si.getList().size() - 1 ).getNumber();
			if(memberNumber >= 2000) {
				memberNumber = memberNumber - 1000;
			}
		}else {
			memberNumber = memberNumber + 1000;
		}

		memberNumber = memberNumber + 1;
	}
	public void insert(JTextField name, JTextField age, JTextField height, JTextField a, JTextField b, JTextField c, JRadioButton type) {
		SingletonClass si = SingletonClass.getInstance();
		String h_name =  name.getText();
		// human
		Integer h_age = Integer.parseInt(age.getText());
		Double h_height = Double.parseDouble(height.getText());
		Object obj = type;
		if(type.getText().equals("pit")) {
			Integer win = Integer.parseInt(a.getText());
			Integer lose = Integer.parseInt(b.getText());
			Double defence = Double.parseDouble(c.getText());
			si.getList().add(new Pitcher(memberNumber, h_name, h_age, h_height, win, lose, defence));
		}
		if(type.getText().equals("bat")) {
			Integer memberNum = memberNumber + 1000;
			Integer batcount = Integer.parseInt(a.getText());
			Integer hit = Integer.parseInt(b.getText());
			Double hitAvg = Double.parseDouble(c.getText());
			si.getList().add(new Batter(memberNum, h_name, h_age, h_height, batcount, hit, hitAvg));
		}
		System.out.println(si.getList().toString());
	}
}