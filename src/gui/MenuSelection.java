package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	
	public MenuSelection() {
		// 프레임의 크기를 설정하고 프로그램 종료시 디버깅 종료
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		// 레이블 생성
		JLabel label = new JLabel("Menu Selection");
		
		// 버튼 생성
		JButton button1 = new JButton("Add Food");
		JButton button2 = new JButton("Delete Food");
		JButton button3 = new JButton("Edit Food");
		JButton button4 = new JButton("View Food");
		JButton button5 = new JButton("Exit Program");
		
		// 패널에 레이블과 버튼 추가
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		// 프레임 속 패널의 위치 설정
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		// 프레임을 가시화
		this.setVisible(true);
	}
}
