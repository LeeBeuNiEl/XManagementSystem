package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.FoodAdderCancelListener;
import listeners.FoodAdderListener;
import manager.FoodMenuManager;

public class FoodAdder extends JPanel {
	
	WindowFrame frame;
	
	FoodMenuManager foodmenumanager;

	public FoodAdder(WindowFrame frame, FoodMenuManager foodmenumanager) {
		this.frame = frame; 
		this.foodmenumanager = foodmenumanager;
		
		// �гμ� component�� SpringLayout�������� �迭
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		// �� ��ҵ��� ���̺�� �ؽ�Ʈ�ʵ带 ������ ���̰� ��ġ�� �� �гο� �߰�
		JLabel labelNumber = new JLabel("Number : ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelAddress = new JLabel("Address : ", JLabel.TRAILING);
		JTextField fieldAddress = new JTextField(10);
		labelAddress.setLabelFor(fieldAddress);
		panel.add(labelAddress);
		panel.add(fieldAddress);

		JLabel labelTelephone = new JLabel("Telephone : ", JLabel.TRAILING);
		JTextField fieldTelephone = new JTextField(10);
		labelTelephone.setLabelFor(fieldTelephone);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new FoodAdderListener(fieldNumber, fieldName, fieldAddress, fieldTelephone, foodmenumanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new FoodAdderCancelListener(frame));
		
		panel.add(labelTelephone);
		panel.add(fieldTelephone);
		
		// ����, ��� ��ư �߰�
		panel.add(saveButton);
		panel.add(cancelButton);
		
		// �г� �� ������� ����������� ��ġ�� �����Ͽ� ��ġ
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		// panel�� �߰�
		this.add(panel);
		
	}
	
}
