package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import view.AllPrintView;
import view.DeleteView;
import view.InsertView;
import view.SearchView;
import view.UpdateView;

public class MenuView extends JFrame implements ActionListener{
	JButton insertbt, deletebt, searchbt, updatebt, dataSavebt, dataLoadbt, allPrint;
	
	public MenuView() {
		super("menuview");
		setLayout(null);
		
		insertbt = new JButton("Insert");
		deletebt = new JButton("Delete");
		searchbt = new JButton("Search");
		updatebt = new JButton("Update");
		allPrint = new JButton("AllPrint");
		dataSavebt = new JButton("DataSave");
		
		JLabel la = new JLabel("menuview");
		la.setBounds(150, 0, 100, 100);
		add(la);
		
		
		insertbt.setBounds(150, 80, 100, 50);
		insertbt.addActionListener(this);
		deletebt.setBounds(150, 160, 100, 50);
		deletebt.addActionListener(this);
		searchbt.setBounds(150, 240, 100, 50);
		searchbt.addActionListener(this);
		updatebt.setBounds(150, 320, 100, 50);
		updatebt.addActionListener(this);
		allPrint.setBounds(150, 400, 100, 50);
		allPrint.addActionListener(this);
		dataSavebt.setBounds(150, 80, 100, 50);
		add(insertbt);
		add(deletebt);
		add(searchbt);
		add(updatebt);
		add(dataSavebt);
		add(allPrint);
		
		
		
		
		setBounds(0, 0, 400, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj =  e.getSource();
		if(obj == insertbt) {
//			JOptionPane.showMessageDialog(null, "dasd");
			new InsertView();
		}
		if(obj == deletebt) {
			new DeleteView();
		}
		if(obj == searchbt) {
			new SearchView();
		}
		if(obj == updatebt) {
			new UpdateView();
		}
		if(obj == allPrint) {
			new AllPrintView();
		}
		
		
	}
	

}