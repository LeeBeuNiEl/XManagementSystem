import java.util.Scanner;

public class MainMenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FoodMenuManager foodmenumanager = new FoodMenuManager(input);
		
		int num = -1;
		while (num != 5) {
			System.out.println("***********************");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Foods");
			System.out.println("5. Exit");
			System.out.print("Slect one number between 1-5 : ");
			num = input.nextInt();
			
			if (num == 1) {
				foodmenumanager.addFoods();
			}
			else if (num == 2) {
				foodmenumanager.deleteFoods();
			}
			else if (num == 3) {
				foodmenumanager.editFoods();
			}
			else if (num == 4) {
				foodmenumanager.viewFoods();
			}
			else {
				continue;
			}
		}
	}
}