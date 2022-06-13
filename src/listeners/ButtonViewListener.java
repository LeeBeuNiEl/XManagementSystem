package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.FoodViewer;
import gui.WindowFrame;
import manager.FoodMenuManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	// �����ӿ� ���ο� ������ ������Ʈ �� viewer�г��� ���� �Լ�
	public void actionPerformed(ActionEvent e) {
		FoodViewer foodViewer = frame.getFoodviewer();
		FoodMenuManager foodmenumanager = getObject("foodmenumanager.ser");
		foodViewer.setFoodmenumanager(foodmenumanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(foodViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	// �ش� ���Ͽ� log������ Serialize�Ѵ�.
	public static FoodMenuManager getObject(String filename) {
		FoodMenuManager foodmenumanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			foodmenumanager = (FoodMenuManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return foodmenumanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return foodmenumanager;	
	}

}
