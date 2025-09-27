package thanu.java;

public class Grade {
	public static void main(String[]args) {
			int score = 75;
		    String grade = switch (score/10) {
		    case 10,9 -> "A";
		    case 8 -> "B";
		    case 7 -> "C";
		    default -> "F";
		    };
		    System.out.println("Grade: " + grade);
		}
}
	


