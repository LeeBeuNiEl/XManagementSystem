package food;

import java.util.Scanner;
//�ҽ��� �ʿ��� Ŭ������ �θ� Ŭ����
public abstract class SauceFood extends Food {
	
	public SauceFood(FoodKind kind) {
		super(kind);
	}
	
	protected String level;
	
	// �߰� �ҽ��� ������ �����ϰ� ����ϴ� getter, setter �޼ҵ�
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " additional sauce : " + level + " telephone : " + telephone);
	}
	// �߰� �ҽ��� �ʿ����� ����� �ʿ��ϴٸ� ���� �Է� �� �����ϴ� �Լ�
	public void setSauce(Scanner input) {
		char answer2 = 'x';
		while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'n' && answer2 != 'N' ) 
		{
			System.out.print("Do I need more sauce? (Y/N)");
			answer2 = input.nextLine().charAt(0);
			if (answer2 == 'y' || answer2 == 'Y') {
				System.out.print("How much more : ");
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
	}

}
