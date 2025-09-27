package thanu.java;

public class Variables {
		public static int sum(int...nums) {
			int total = 0;
			for(int n : nums) {
				total += n;
			}
			return total;
		}
		public static void main(String[]args) {
			System.out.println("Sum of 2 numbers:" + sum(10,20));
			System.out.println("Sum of 4 numbers:" + sum(1,2,3,4));
			System.out.println("Sum of 8 numbers:" + sum(1,2,3,4,5,6,7,8));
		}
	}

