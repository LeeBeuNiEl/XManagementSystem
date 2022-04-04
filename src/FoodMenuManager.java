import java.util.ArrayList;
import java.util.Scanner;

public class FoodMenuManager{
	ArrayList<Food> foods = new ArrayList<Food>();
	Scanner input;
	FoodMenuManager(Scanner input){
		this.input = input;
	}

	public void addFoods() {
		Food food = new Food();
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
		int index = -1;
		for (int i =0; i < foods.size(); i++){
			if(foods.get(i).number == foodnumber) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			foods.remove(index);
			Food.numFoodsRegistered--;
			System.out.println("the food" + foodnumber + "is deleted");
		}
		else {
			System.out.println("the food has not been registered");
			return;
		}
	}
	
	public void editFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		for (int i = 0; i < foods.size(); i++) {
			Food food = foods.get(i);
			if (food.number == foodnumber) {
				int num = -1;
				while (num != 5) {
					System.out.println("***********************");
					System.out.println("1. edit number");
					System.out.println("2. edit food name");
					System.out.println("3. edit adrress");
					System.out.println("4. edit telephone number");
					System.out.println("5. Exit");
					System.out.print("Slect one number between 1-5 : ");
					num = input.nextInt();
					
					if (num == 1) {
						System.out.print("Food Number : ");
						food.number = input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Food Name : ");
						food.name = input.nextLine();
					}
					else if (num == 3) {
						System.out.print("Store Address : ");
						food.address = input.nextLine();
					}
					else if (num == 4) {
						System.out.print("Store Telephone : ");
						food.telephone = input.nextLine();
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewFoods() {
		System.out.print("# of registered foods : " + Food.numFoodsRegistered);
		for (int i = 0; i < foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}
}
