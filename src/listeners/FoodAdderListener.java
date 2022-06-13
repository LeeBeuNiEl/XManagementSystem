package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.TelephoneFormatException;
import food.FoodInput;
import food.FoodKind;
import food.SourFood;
import manager.FoodMenuManager;

public class FoodAdderListener implements ActionListener {

	JTextField fieldNumber;
	JTextField fieldName;
	JTextField fieldAddress;
	JTextField fieldTelephone;
	
	FoodMenuManager foodmenumanager;
	
	// gui에 입력된 내용을 저장
	public FoodAdderListener(
			JTextField fieldNumber, 
			JTextField fieldName, 
			JTextField fieldAddress,
			JTextField fieldTelephone, FoodMenuManager foodmenumanager) {
		this.fieldNumber = fieldNumber;
		this.fieldName = fieldName;
		this.fieldAddress = fieldAddress;
		this.fieldTelephone = fieldTelephone;
		this.foodmenumanager = foodmenumanager;
	}
	
	// 입력된 내용을 각 위치에 맞게 저장해서 문서에 저장
	public void actionPerformed(ActionEvent e) {
		FoodInput food = new SourFood(FoodKind.Sour);
		try {
			food.setNumber(Integer.parseInt(fieldNumber.getText()));
			food.setName(fieldName.getName());
			food.setAddress(fieldAddress.getText());
			food.setTelephone(fieldTelephone.getText());
			foodmenumanager.addFoods(food);
			putObject(foodmenumanager, "foodmenumanager.ser");
			food.printInfo();
		} catch (TelephoneFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	// 문서에 입력
	public static void putObject(FoodMenuManager foodmenumanager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(foodmenumanager);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
