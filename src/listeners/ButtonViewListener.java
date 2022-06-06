package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.FoodViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	// �����ӿ� viewer�г��� ���� �Լ�
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		FoodViewer viewer = frame.getFoodviewer();
		frame.setupPanel(viewer);
	}

}
