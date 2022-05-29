package food;

import java.util.Scanner;

public class SpicyFood extends Food{
	
	protected String level;
	
	public SpicyFood(FoodKind kind) {
		super(kind);
	}
	
	// 맵기 정도를 저장하고 출력하는 getter, setter 메소드
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	// 음식의 번호, 이름, 가게 주소, 맵기, 가게 번호를 저장하는 메소드
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		
		// 추가 소스가 필요한지 물어보고 필요하다면 개수 입력 및 저장
		char answer2 = 'x';
		while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'n' && answer2 != 'N' ) 
		{
			System.out.print("Can I select the spicy level? (Y/N)");
			answer2 = input.nextLine().charAt(0);
			if (answer2 == 'y' || answer2 == 'Y') {
				System.out.print("Spicy Level : ");
				String level = input.nextLine();
				this.setLevel(level);
				break;
			}
			else if (answer2 == 'n' || answer2 == 'N') {
				this.setLevel("");
				break;
			}
			else {
				
			}
		} 
		setFoodTelephone(input);
	}
	// 음식의 정보를 출력하는 메소드
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " spicy level : " + level + " telephone : " + telephone);
	}
}
