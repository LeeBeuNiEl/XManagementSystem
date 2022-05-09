package food;

import java.util.Scanner;

public abstract class Food {
	
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
	
	
	public abstract void printInfo();

}
