import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FoodMenuManager foodmenumanager = new FoodMenuManager(input);
		
		selectMenu(input, foodmenumanager);
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
					break;
				case 2:
					foodmenumanager.deleteFoods();
					break;
				case 3:
					foodmenumanager.editFoods();
					break;
				case 4:	
					foodmenumanager.viewFoods();
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
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("***********************");
		System.out.println("1. Add Food");
		System.out.println("2. Delete Food");
		System.out.println("3. Edit Food");
		System.out.println("4. View Foods");
		System.out.println("5. Exit");
		System.out.print("Slect one number between 1-5 : ");
	}
}