package thanu.java;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Divison by zero is not allowed.");
		}
		finally {
			System.out.println("This block always executes.");
		}
	}
}
