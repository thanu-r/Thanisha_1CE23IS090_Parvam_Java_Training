package thanu.java;

public class ExceptinExample1 {
	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic error occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is invalid");
		}
		catch(Exception e) {
			System.out.println("Some other exception is occured");
		}
	}
}
	
