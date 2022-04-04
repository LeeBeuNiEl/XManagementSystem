
public class Food {
	
	int number;
	String name;
	String address;
	String telephone;
	static int numFoodsRegistered = 0;
	
	public Food() {
		numFoodsRegistered++;
	}
	public Food(int number, String name) {
		this.number = number;
		this.name = name;
		numFoodsRegistered++;
	}
	
	public Food(int number, String name, String address, String telephone) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		numFoodsRegistered++;
	}
	
	public void printInfo() {
		System.out.println("number : " + number + " name : " + name + " address : " + address + " telephone : " + telephone);
	}

}
