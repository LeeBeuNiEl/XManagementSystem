package food;

import java.util.Scanner;

public class BitterFood extends Food{
	
	
	public BitterFood(FoodKind kind) {
		super(kind);
	}
	
	// ������ ��ȣ, �̸�, ���� �ּ�, ���� ��ȣ�� �����ϴ� �޼ҵ�
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		setFoodTelephone(input);
	}
	// ������ ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " telephone : " + telephone);
	}
}
