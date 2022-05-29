import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MainMenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");
	// logging�� foodmenumanager���Ͽ� ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FoodMenuManager foodmenumanager = getObject("foodmenumanager.ser");
		if (foodmenumanager == null) {
			foodmenumanager = new FoodMenuManager(input);
		}
		selectMenu(input, foodmenumanager);
		putObject(foodmenumanager, "foodmenumanager.ser");
	}
	
	public static void selectMenu(Scanner input, FoodMenuManager foodmenumanager) {
		// ���θ޴��� ����ϰ� �Է��� ��ȣ�� �´� ��� ����
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();

				switch(num){
				case 1:
					foodmenumanager.addFoods();
					logger.log("add a food");
					break;
				case 2:
					foodmenumanager.deleteFoods();
					logger.log("delete a food");
					break;
				case 3:
					foodmenumanager.editFoods();
					logger.log("edit a food");
					break;
				case 4:	
					foodmenumanager.viewFoods();
					logger.log("view a list of foods");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("error : please put one number between 1-5");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}// character���� ���ڷ� �Էµ� ��� �������� ���
		}
	}
	
	public static void showMenu() { // �޴� ��� �Լ�
		System.out.println("***********************");
		System.out.println("1. Add Food");
		System.out.println("2. Delete Food");
		System.out.println("3. Edit Food");
		System.out.println("4. View Foods");
		System.out.println("5. Exit");
		System.out.print("Slect one number between 1-5 : ");
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
	// �ش� ���Ͽ� Serialize�� ������ ����Ʈ �������� ����Ѵ�.
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