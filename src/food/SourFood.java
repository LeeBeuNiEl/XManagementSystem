package food;

import java.util.Scanner;

public class SourFood extends Food{
	
	public SourFood(FoodKind kind) {
		super(kind);
	}
	
	// ������ ��ȣ, �̸�, ���� �ּ�, ���� ��ȣ�� �����ϴ� �޼ҵ�
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		setFoodTelephone(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " telephone : " + telephone);
	}

}
