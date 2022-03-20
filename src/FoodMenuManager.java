import java.util.Scanner;

public class FoodMenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		while (num != 6) {
			System.out.println("1. Add Foods");
			System.out.println("2. Delete Foods");
			System.out.println("3. Edit Foods");
			System.out.println("4. View Foods");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Slect one number between 1-6 : ");
			num = input.nextInt();
			
			if (num == 1) {
				addFoods();
			}
			else if (num == 2) {
				deleteFoods();
			}
			else if (num == 3) {
				editFoods();
			}
			else if (num == 4) {
				viewFoods();
			}
			else {
				continue;
			}
		}
	}

	public static void addFoods() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		System.out.print("Food Name : ");
		String foodname = input.nextLine();
		foodname = input.nextLine();
		System.out.print("Store address : ");
		String storeaddress = input.nextLine();
		System.out.print("Store Number : ");
		String storenumber = input.nextLine();
	}
	
	public static void deleteFoods() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
	}
	
	public static void editFoods() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
	}
	
	public static void viewFoods() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
	}
}
