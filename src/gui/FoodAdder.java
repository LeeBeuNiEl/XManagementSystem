package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FoodAdder extends JFrame {

	public FoodAdder() {
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
		panel.add(labelTelephone);
		panel.add(fieldTelephone);
		
		// ����, ��� ��ư �߰�
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		// �г� �� ������� ����������� ��ġ�� �����Ͽ� ��ġ
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		// �������� ũ�⸦ �����ϰ� ���α׷� ����� ����� ����
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �������� panel�� ä��� ����ȭ
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
	
}
