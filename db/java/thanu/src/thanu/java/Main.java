package thanu.java;

public class Main {
	public String brand;
	public int year;

	public void display() {
		System.out.println("this is a display method");
	}

	public static void main(String[] args) {
		Main  car1 = new Main();
		car1.brand = "Toyata";
		car1.year = 2022;
		car1.display();
	}

}
