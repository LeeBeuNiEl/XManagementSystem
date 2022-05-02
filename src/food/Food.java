package food;

import java.util.Scanner;

public class Food {
	
	protected FoodKind kind = FoodKind.Spicy;
	protected int number;
	protected String name;
	protected String address;
	protected String telephone;
	
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
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public void printInfo() {
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
		
		System.out.println("kind" + skind + " number : " + number + " name : " + name + " address : " + address + " telephone : " + telephone);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Food Name : ");
		String foodname = input.nextLine();
		String name = input.nextLine();
		this.setName(name);
		
		System.out.print("Store address : ");
		String address = input.nextLine();
		this.setAddress(address);
		
		System.out.print("Store Number : ");
		String telephone = input.nextLine();
		this.setTelephone(telephone);
	}

}
