package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FoodAdder extends JFrame {

	public FoodAdder() {
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
		panel.add(labelTelephone);
		panel.add(fieldTelephone);
		
		// 저장, 취소 버튼 추가
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		// 패널 속 내용들을 행렬형식으로 위치를 설정하여 배치
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		// 프레임의 크기를 설정하고 프로그램 종료시 디버깅 종료
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임을 panel로 채우고 가시화
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
	
}
