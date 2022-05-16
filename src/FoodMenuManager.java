import java.util.ArrayList;
import java.util.InputMismatchException;
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
	// 입력한 음식 정보를 저장하는 배열
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();
	Scanner input;
	FoodMenuManager(Scanner input){
		this.input = input;
	}

	// 음식의 종류를 고르고 정보를 입력해 저장
	public void addFoods() {
		int kind = 0;
		FoodInput food = null;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			try {
				showAddMenu();
				kind = input.nextInt();

				switch(kind) {
				case 1:
					setSaltyFood(food, input);
					break;
				case 2:
					setSweetFood(food, input);
					break;
				case 3:
					setSourFood(food, input);
					break;
				case 4:
					setBitterFood(food, input);
					break;
				case 5:
					setSpicyFood(food, input);
					break;
				default:
					System.out.print("Select num for Food Kind between 1 to 5 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("error : please put one number between 1-5");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
		 
	}
	
	public void setSaltyFood(FoodInput food, Scanner input) {
		food = new SaltyFood(FoodKind.Salty);
		food.getUserInput(input);
		foods.add(food);
	}
	
	public void setSweetFood(FoodInput food, Scanner input) {
		food = new SweetFood(FoodKind.Sweet);
		food.getUserInput(input);
		foods.add(food);
	}
	
	public void setSourFood(FoodInput food, Scanner input) {
		food = new SourFood(FoodKind.Sour);
		food.getUserInput(input);
		foods.add(food);
	}
	
	public void setBitterFood(FoodInput food, Scanner input) {
		food = new BitterFood(FoodKind.Bitter);
		food.getUserInput(input);
		foods.add(food);
	}
	
	public void setSpicyFood(FoodInput food, Scanner input) {
		food = new SpicyFood(FoodKind.Spicy);
		food.getUserInput(input);
		foods.add(food);
	}
	
	public void showAddMenu() {
		System.out.println("1 for Salty");
		System.out.println("2 for Sweet");
		System.out.println("3 for Sour");
		System.out.println("4 for Bitter");
		System.out.println("5 for Spicy");
		System.out.print("Select num for Food Kind between 1 to 5 : ");
	}
	
	// 음식 번호를 입력해 기존의 음식 정보 삭제
	public void deleteFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		int index = findIndex(foodnumber);
		removefromfoods(index, foodnumber);
	}
	
	public int findIndex(int foodnumber) {
		int index = -1;
		for (int i =0; i < foods.size(); i++){
			if(foods.get(i).getNumber() == foodnumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromfoods(int index, int foodnumber) {
		if (index >= 0) {
			foods.remove(index);
			System.out.println("the food" + foodnumber + "is deleted");
			return 1;
		}
		else {
			System.out.println("the food has not been registered");
			return -1;
		}
	}
	
	// 입력한 번호에 해당하는 음식을 찾아 원하는 정보 수정
	public void editFoods() {
		System.out.print("Food Number : ");
		int foodnumber = input.nextInt();
		for (int i = 0; i < foods.size(); i++) {
			FoodInput food = foods.get(i);
			if (food.getNumber() == foodnumber) {
				int num = -1;
				while (num != 5) {
					
					showEditMenu();
					num = input.nextInt();
					
					switch(num) {
					case 1:
						food.setFoodNumber(input);
						break;
					case 2:
						food.setFoodName(input);
						break;
					case 3:
						food.setFoodAddress(input);
						break;
					case 4:
						food.setFoodTelephone(input);
						break;
					default:
						continue;
					} // switch
				} // while
				break;
			} // if
		} // while
	}
	
	
	
	public void showEditMenu() {
		System.out.println("***********************");
		System.out.println("1. edit number");
		System.out.println("2. edit food name");
		System.out.println("3. edit adrress");
		System.out.println("4. edit telephone number");
		System.out.println("5. Exit");
		System.out.print("Slect one number between 1-5 : ");
	}
	
	// 저장된 음식의 개수와 정보 출력
		public void viewFoods() {
			System.out.println("# of registered foods : " + foods.size());
			for (int i = 0; i < foods.size(); i++) {
				foods.get(i).printInfo();
			}
		}
}
