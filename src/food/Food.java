package food;

import java.io.Serializable;
import java.util.Scanner;

import exception.TelephoneFormatException;

public abstract class Food implements FoodInput, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 413653737158155006L;
	
	protected FoodKind kind = FoodKind.Spicy;
	protected int number;
	protected String name;
	protected String address;
	protected String telephone;
	
	// 입력한 인자의 형식에 따른 정보 수정을 위한 다양한 생성자
	public Food() {
	}
	
	public Food(FoodKind kind) {
		this.kind = kind;
	}
	
	public Food(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Food(int number, String name, String address, String telephone) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	
	public Food(FoodKind kind, int number, String name, String address, String telephone) {
		this.kind = kind;
		this.number = number;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	
	// protected된 변수에 값을 넣기 위한 getter, setter 메소드
	public FoodKind getKind() {
		return kind;
	}
	public void setKind(FoodKind kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) throws TelephoneFormatException{
		if (!telephone.contains("-")) {
			throw new TelephoneFormatException();
		}
		
		this.telephone = telephone;
	}
	
	// 자식클래스에 필요한 공통 메소드를 선언
	public abstract void printInfo();
	
	public void setFoodNumber(Scanner input) {
		System.out.print("Food Number : ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	
	public void setFoodName(Scanner input) {
		System.out.print("Food Name : ");
		String foodname = input.nextLine();
		String name = input.nextLine();
		this.setName(name);
	}
	
	public void setFoodAddresswithYN(Scanner input) {
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N' ) 
		{
			System.out.print("Do you have a store address? (Y/N)");
			answer1 = input.nextLine().charAt(0);
			if (answer1 == 'y' || answer1 == 'Y') {
				setFoodAddress(input);
				break;
			}
			else if (answer1 == 'n' || answer1 == 'N') {
				this.setAddress("");
				break;
			}
			else {
				
			}
		}
	}
	
	public void setFoodAddress(Scanner input) {
		System.out.print("Store Address : ");
		String foodaddress = input.nextLine();
		String address = input.nextLine();
		this.setAddress(address);
	}
	
	public void setFoodTelephone(Scanner input) {
		String telephone = "";
		while (!telephone.contains("-")) {
			System.out.print("Store Telephone : ");
			telephone = input.nextLine();
			try {
				this.setTelephone(telephone);
			} catch (TelephoneFormatException e) {
				System.out.println("Incorrect Format. put the telephone number like 010-1234-5678 ");
			}
		}
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Salty:
			skind = "Salty";
			break;
		case Sweet:
			skind = "Sweet";
			break;
		case Sour:
			skind = "Sour";
			break;
		case Bitter:
			skind = "Bitter";
			break;
		case Spicy:
			skind = "Spicy";
			break;
		default:
		}
		return skind;
	}

}
