package food;

import java.util.Scanner;

public class SpicyFood extends Food{
	
	protected String level;
	
	public SpicyFood(FoodKind kind) {
		super(kind);
	}
	
	// �ʱ� ������ �����ϰ� ����ϴ� getter, setter �޼ҵ�
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	// ������ ��ȣ, �̸�, ���� �ּ�, �ʱ�, ���� ��ȣ�� �����ϴ� �޼ҵ�
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		setFoodAddresswithYN(input);
		
		// �߰� �ҽ��� �ʿ����� ����� �ʿ��ϴٸ� ���� �Է� �� ����
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
	// ������ ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " spicy level : " + level + " telephone : " + telephone);
	}
}
