package hw5Q3variableAndMethod;
/*03.a) Create a package name "hw5Q3variableAndMethod" in your HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- "configuration" and use only one System.out.println(). Use the variables inside sysout.
 * 3.b) Create another class TestComputer. Create object from Computer class under main method. Initialize object and configuration method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 * 
 */

public class Computer { //Declare variable 
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;
	
	public void configuration(){//configuration Method Implement 
		
		System.out.println("My Brand: "+Brand+"  Model: "+Model+" Operating system: "+OperatingSystem+"  Price: "+price+"$"+" Made in USA ? "+madeInUSA+" Grade:  "+grade);// use only one System.out.println().
		
		
	}
	
	public static void main(String[] args) {
		
		
	

	}

}
