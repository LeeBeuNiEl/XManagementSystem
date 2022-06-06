package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		// �г� ����
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		// ���̺� ����
		JLabel label = new JLabel("Menu Selection");
		
		// ��ư ����
		JButton button1 = new JButton("Add Food");
		JButton button2 = new JButton("Delete Food");
		JButton button3 = new JButton("Edit Food");
		JButton button4 = new JButton("View Food");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		// �гο� ���̺��� ��ư �߰�
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		// ������ �� �г��� ��ġ ����
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		

	}
}