package thanu.java;
class Animal{
	void eat() {
		System.out.println("This animal eats food");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog barks");
	}
}
public class Main1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}