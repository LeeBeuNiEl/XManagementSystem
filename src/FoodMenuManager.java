import java.util.ArrayList;
import java.util.Scanner;

import food.BitterFood;
import food.Food;
import food.FoodKind;
import food.FoodInput;
import food.SaltyFood;
import food.SourFood;
import food.SpicyFood;
import food.SweetFood;

public class FoodMenuManager{
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();
	Scanner input;
	FoodMenuManager(Scanner input){
		this.input = input;
	}

	public void addFoods() {
		int kind = 0;
		FoodInput foodInput;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.println("1 for Salty");
			System.out.println("2 for Sweet");
			System.out.println("3 for Sour");
			System.out.println("4 for Bitter");
			System.out.println("5 for Spicy");
			System.out.print("Select num for Food Kind between 1 to 5 : ");
			kind = input.nextInt();
			if (kind == 1) {
				foodInput = new SaltyFood(FoodKind.Salty);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if (kind == 2) {
				foodInput = new SweetFood(FoodKind.Sweet);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if (kind == 3) {
				foodInput = new SourFood(FoodKind.Sour);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if (kind == 4) {
				foodInput = new BitterFood(FoodKind.Bitter);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if (kind == 5) {
				foodInput = new SpicyFood(FoodKind.Spicy);
				foodInput.getUserInput(input);
				foods.add(foodInput);
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
			FoodInput foodInput = foods.get(i);
			if (foodInput.getNumber() == foodnumber) {
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
						foodInput.setNumber(number);
					}
					else if (num == 2) {
						System.out.print("Food Name : ");
						String foodname = input.nextLine();
						String name = input.nextLine();
						foodInput.setName(name);
					}
					else if (num == 3) {
						System.out.print("Store Address : ");
						String foodname = input.nextLine();
						String address = input.nextLine();
						foodInput.setAddress(address);
					}
					else if (num == 4) {
						System.out.print("Store Telephone : ");
						String foodname = input.nextLine();
						String telephone = input.nextLine();
						foodInput.setTelephone(telephone);
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
