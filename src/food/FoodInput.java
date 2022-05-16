package food;

import java.util.Scanner;

import exception.TelephoneFormatException;

public interface FoodInput {
	
	// �� Ŭ������ �ʿ��� �޼ҵ���� ����
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setAddress(String address);
	
	public void setTelephone(String telephone) throws TelephoneFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setFoodNumber(Scanner input);

	public void setFoodName(Scanner input);
	
	public void setFoodAddress(Scanner input);
	
	public void setFoodTelephone(Scanner input);
	
	public void setFoodAddresswithYN(Scanner input);
	
}
