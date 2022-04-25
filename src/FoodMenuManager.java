import java.util.ArrayList;
import java.util.Scanner;

import food.Food;
import food.SaltyFood;

public class FoodMenuManager{
	ArrayList<Food> foods = new ArrayList<Food>();
	Scanner input;
	FoodMenuManager(Scanner input){
		this.input = input;
	}

	public void addFoods() {
		int kind = 0;
		Food food;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.print("1 for Salty");
			System.out.print("2 for Sweet");
			System.out.print("3 for Sour");
			System.out.print("4 for Bitter");
			System.out.print("5 for Spicy");
			System.out.print("Select num for Food Kind between 1 to 5 : ");
			kind = input.nextInt();
			if (kind == 1) {
				food = new SaltyFood();
				food.getUserInput(input);
				foods.add(food);
				break;
			}
			else if (kind == 2) {
				food = new Food();
				foods.add(food);
				break;
			}
			else if (kind == 3) {
				food = new Food();
				foods.add(food);
				break;
			}
			else if (kind == 4) {
				food = new Food();
				foods.add(food);
				break;
			}
			else if (kind == 5) {
				food = new Food();
				foods.add(food);
				break;
			}
			else {
				System.out.print("Select num for Food Kind between 1 to 5 : ");
			}
		}
		 
	}
	
	public void deleteFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		int index = -1;
		for (int i =0; i < foods.size(); i++){
			if(foods.get(i).getNumber() == foodnumber) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			foods.remove(index);
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
			if (food.getNumber() == foodnumber) {
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
						int number = input.nextInt();
						food.setNumber(number);
					}
					else if (num == 2) {
						System.out.print("Food Name : ");
						String foodname = input.nextLine();
						String name = input.nextLine();
						food.setName(name);
					}
					else if (num == 3) {
						System.out.print("Store Address : ");
						String foodname = input.nextLine();
						String address = input.nextLine();
						food.setAddress(address);
					}
					else if (num == 4) {
						System.out.print("Store Telephone : ");
						String foodname = input.nextLine();
						String telephone = input.nextLine();
						food.setTelephone(telephone);
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // while
	}
	
	public void viewFoods() {
		System.out.println("# of registered foods : " + foods.size());
		for (int i = 0; i < foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}
}
