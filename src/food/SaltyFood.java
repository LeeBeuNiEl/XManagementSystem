package food;

import java.util.Scanner;

public class SaltyFood extends SauceFood{
	
	public SaltyFood(FoodKind kind) {
		super(kind);
	}
	
	// ������ ��ȣ, �̸�, ���� �ּ�, �߰� �ҽ� ����, ���� ��ȣ�� �����ϴ� �޼ҵ�
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		setSauce(input);
		setFoodTelephone(input);
	}
	
	
	// ������ ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " salty sauce : " + level + " telephone : " + telephone);
	}
	
	
}
