package food;

import java.util.Scanner;

public class SweetFood extends SauceFood{
	
	public SweetFood(FoodKind kind) {
		super(kind);
	}
	
	// ������ ��ȣ, �̸�, ���� �ּ�, ���� ��ȣ�� �����ϴ� �޼ҵ�
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
