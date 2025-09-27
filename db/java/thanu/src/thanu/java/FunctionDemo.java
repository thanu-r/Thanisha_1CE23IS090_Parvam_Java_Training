package thanu.java;

public class FunctionDemo {
	public static int square(int x) {
		return x * x;		
	}
	public void greet() {
		System.out.println("Hello!");
	}
	public void greet(String name) {
		System.out.println("Hello, "+name+"!");
	}
	public static int sum(int... nums) {
		int total = 0;
		for(int n : nums) total += n;
		return total;
	}
	public static int factorial(int n) {
		return (n==0) ? 1 : n * factorial(n - 1);
	}
	public static void main(String[] args) {
		System.out.println("Square of 5: " + square(5));
		FunctionDemo obj = new FunctionDemo();
		obj.greet();
		obj.greet("Muthy");
		 
		System.out.println("Sum: "+ sum(2, 4, 6));
		
		System.out.println("Factorial of 5: " + factorial(5));
	}

}
