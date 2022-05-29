package food;

import java.util.Scanner;
//소스가 필요한 클래스의 부모 클래스
public abstract class SauceFood extends Food {
	
	public SauceFood(FoodKind kind) {
		super(kind);
	}
	
	protected String level;
	
	// 추가 소스의 개수를 저장하고 출력하는 getter, setter 메소드
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
	// 추가 소스가 필요한지 물어보고 필요하다면 개수 입력 및 저장하는 함수
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
