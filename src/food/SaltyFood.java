package food;

import java.util.Scanner;

public class SaltyFood extends Food {

	public void getUserInput(Scanner input) {
		System.out.print("Food Number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Food Name : ");
		String foodname = input.nextLine();
		String name = input.nextLine();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Store address : ");
				String address = input.nextLine();
				this.setAddress(address);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setAddress("");
				break;
			}
			else {
				
			}
		}
		
		System.out.print("Store address : ");
		String address = input.nextLine();
		this.setAddress(address);
		
		System.out.print("Store Number : ");
		String telephone = input.nextLine();
		this.setTelephone(telephone);
	}
	
}
