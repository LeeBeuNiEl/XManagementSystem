package food;

import java.util.Scanner;

public class SaltyFood extends SauceFood{
	
	public SaltyFood(FoodKind kind) {
		super(kind);
	}
	
	// 음식의 번호, 이름, 가게 주소, 추가 소스 개수, 가게 번호를 저장하는 메소드
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		setSauce(input);
		setFoodTelephone(input);
	}
	
	
	// 음식의 정보를 출력하는 메소드
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " salty sauce : " + level + " telephone : " + telephone);
	}
	
	
}
