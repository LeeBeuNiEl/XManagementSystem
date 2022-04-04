import java.util.Scanner;

public class FoodMenuManager{
	Food food;
	Scanner input;
	FoodMenuManager(Scanner input){
		this.input = input;
	}

	public void addFoods() {
		food = new Food();
		System.out.print("Food Number : ");
		food.number = input.nextInt();
		System.out.print("Food Name : ");
		String foodname = input.nextLine();
		food.name = input.nextLine();
		System.out.print("Store address : ");
		food.address = input.nextLine();
		System.out.print("Store Number : ");
		food.telephone = input.nextLine();
	}
	
	public void deleteFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		if(food == null) {
			System.out.println("the food has not been registered");
			return;
		}
		if (food.number == foodnumber) {
			food = null;
			System.out.println("the food is deleted");
		}
	}
	
	public void editFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		if (food.number == foodnumber) {
			System.out.println("the food to be edited is " + foodnumber);
		}
	}
	
	public void viewFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		if (food.number == foodnumber) {
			food.printInfo();
		}
	}
}
