package food;

import java.util.Scanner;

public class SourFood extends Food {
	
	protected String level;
	
	public SourFood(FoodKind kind) {
		super(kind);
	}
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Food Name : ");
		String foodname = input.nextLine();
		String name = input.nextLine();
		this.setName(name);
		
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N' ) 
		{
			System.out.print("Do you have an email address? (Y/N)");
			answer1 = input.nextLine().charAt(0);
			if (answer1 == 'y' || answer1 == 'Y') {
				System.out.print("Store address : ");
				String address = input.nextLine();
				this.setAddress(address);
				break;
			}
			else if (answer1 == 'n' || answer1 == 'N') {
				this.setAddress("");
				break;
			}
			else {
				
			}
		}
		
		System.out.print("Store Number : ");
		String telephone = input.nextLine();
		this.setTelephone(telephone);
	}

}
