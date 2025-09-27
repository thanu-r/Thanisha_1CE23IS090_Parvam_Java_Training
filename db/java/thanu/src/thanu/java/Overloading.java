package thanu.java;

public class Overloading {
		public void greet() {
			System.out.println("Hello!");
		}
		public void greet(String name) {
			System.out.println("Hello,"+name+"!");
		}
		public static void main(String[]args) {
			Overloading obj = new Overloading();
			obj.greet();
			obj.greet("Rosie");
		}
	}

