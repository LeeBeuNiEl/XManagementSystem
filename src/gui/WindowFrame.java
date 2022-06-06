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
		
		// �������� ũ�⸦ �����ϰ� ���α׷� ����� ����� ����
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(menuselection);
		
		// �������� ����ȭ
		this.setVisible(true);
	}
	
	// �����ӿ��� ������ �ִ� �г��� ����� �Է¹��� �г��� �߰��ϴ� �޼ҵ�
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
