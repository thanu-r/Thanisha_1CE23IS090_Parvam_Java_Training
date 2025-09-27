package thanu.java;

public class Preson {
	private String name;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Preson p = new Preson();
		p.setName("Vidya");
		System.out.println(p.getName());
	}
}
