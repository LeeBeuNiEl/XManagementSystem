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
		
		// 패널속 component를 SpringLayout형식으로 배열
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		// 각 요소들의 레이블과 텍스트필드를 나란히 놓이게 배치한 후 패널에 추가
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
		
		// 저장, 취소 버튼 추가
		panel.add(saveButton);
		panel.add(cancelButton);
		
		// 패널 속 내용들을 행렬형식으로 위치를 설정하여 배치
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		// panel을 추가
		this.add(panel);
		
	}
	
}
