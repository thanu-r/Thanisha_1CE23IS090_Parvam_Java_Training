package thanu.java;

public class DataTypeExample {
	static int staticVar = 100;       //static variable
	int instanceVar = 50;            //instance variable
	
	public void display() {
		int localVar = 25;         //local variable
		System.out.println("static : " + staticVar);
		System.out.println("Instance: " + instanceVar);
		System.out.println("Local: " + localVar);
	}
	public static void main(String[] args) {
		DataTypeExample obj = new DataTypeExample();
		obj.display();
		
		double pi = 3.14;
		int approxPi = (int) pi;  //Expilcit casting
		System.out.println("Approximate Pi: " + approxPi );  
	}
	

}
