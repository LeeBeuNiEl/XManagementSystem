package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.FoodAdder;
import gui.FoodViewer;
import gui.WindowFrame;

public class FoodAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public FoodAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	// 프레임을 초기 화면을 띄우는 함수
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
