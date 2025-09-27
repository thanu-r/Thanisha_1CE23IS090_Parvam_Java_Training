package thanu.java;

public class Exception {
	public static void main(String[] args) {
		try {
			int num  = Integer.parseInt("123");
			System.out.println("Number: " + num);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid numberformat.");
		}
		finally {
			System.out.println("End of program.");
		}
	}

}