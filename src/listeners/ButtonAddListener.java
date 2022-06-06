package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.FoodAdder;
import gui.FoodViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	// �����ӿ� adder�г��� ���� �Լ�
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		FoodAdder adder = frame.getFoodadder();
		frame.setupPanel(adder);
	}

}
