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
	// logging을 foodmenumanager파일에 기록한다.
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
		// 메인메뉴를 출력하고 입력한 번호에 맞는 기능 실행
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
			}// character형이 인자로 입력될 경우 오류문장 출력
		}
	}
	
	public static void showMenu() { // 메뉴 출력 함수
		System.out.println("***********************");
		System.out.println("1. Add Food");
		System.out.println("2. Delete Food");
		System.out.println("3. Edit Food");
		System.out.println("4. View Foods");
		System.out.println("5. Exit");
		System.out.print("Slect one number between 1-5 : ");
	}
	// 해당 파일에 log정보를 Serialize한다.
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
	// 해당 파일에 Serialize된 정보를 바이트 형식으로 출력한다.
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