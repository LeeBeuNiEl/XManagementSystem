package food;

import java.util.Scanner;

public interface FoodInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setAddress(String address);
	
	public void setTelephone(String telephone);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
