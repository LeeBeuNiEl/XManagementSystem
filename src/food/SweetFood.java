package food;

import java.util.Scanner;

public class SweetFood extends SauceFood{
	
	public SweetFood(FoodKind kind) {
		super(kind);
	}
	
	// 음식의 번호, 이름, 가게 주소, 가게 번호를 저장하는 메소드
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		setSauce(input);
		setFoodTelephone(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " sweet sauce : " + level + " telephone : " + telephone);
	}
	
}
