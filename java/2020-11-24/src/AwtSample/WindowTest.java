package AwtSample;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// 모두 awt소속
public class WindowTest extends Frame implements WindowListener{	// Listener 무슨일이 일어나는건지 듣는다.

	public WindowTest() {
		setSize(640, 480);	// window의 폭과 높이
		setLocation(0, 0);	// window의 위치
		setVisible(true); 	// window의 시각화 실행
		
		this.addWindowListener(this); 		// (this) 현재 클래스의 this가 실행  Listener On
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
	public void windowActivated(WindowEvent e) {	// 켜지면 실행 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
