package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.FoodMenuManager;

public class WindowFrame extends JFrame{
	
	FoodMenuManager foodmenumanager;
	MenuSelection menuselection;
	FoodAdder foodadder; 
	FoodViewer foodviewer;

	public WindowFrame(FoodMenuManager foodmenumanager) {
		this.foodmenumanager = foodmenumanager;
		this.menuselection = new MenuSelection(this);
		this.foodadder = new FoodAdder(this);
		this.foodviewer = new FoodViewer(this, this.foodmenumanager);
		
		// 프레임의 크기를 설정하고 프로그램 종료시 디버깅 종료
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(menuselection);
		
		// 프레임을 가시화
		this.setVisible(true);
	}
	
	// 프레임에서 기존에 있던 패널을 지우고 입력받은 패널을 추가하는 메소드
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public FoodAdder getFoodadder() {
		return foodadder;
	}

	public void setFoodadder(FoodAdder foodadder) {
		this.foodadder = foodadder;
	}

	public FoodViewer getFoodviewer() {
		return foodviewer;
	}

	public void setFoodviewer(FoodViewer foodviewer) {
		this.foodviewer = foodviewer;
	}

}
