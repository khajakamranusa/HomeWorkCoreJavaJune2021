package hw5Q3variableAndMethod;

/*3.b) Create another class TestComputer. Create object from Computer class under main method. Initialize object and configuration method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 *  * 
 * 
 *
 */

public class TestComputer {

	public static void main(String[] args) {
		Computer computer=new Computer();//Create object under the main Method
		computer.Brand="Apple";//Initialize object
		computer.Model="MacBook Air";
		computer.OperatingSystem="MacOS Mojave";
		computer.price=800;
		computer.madeInUSA=false;
		computer.grade='A';
		
		computer.configuration();
		
		
	System.out.println("\n******************************************\n");
	
	Computer computer1=new Computer();
	computer1.Brand="Apple";
	computer1.Model="MacBook Air";
	computer1.OperatingSystem="MacOS Mojave";
	computer1.price=700;
	computer1.madeInUSA=false;
	computer1.grade='B';
	
	computer1.configuration();
	

	}

}
