package hw5Q4Constructor;

/*
 * 04) Create a package name "hw5Q4Constructor" in your HW project. Inside the package, 
 * a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). 
 * Declare default constructor and multiple parameterized constructor.
 *  Use only one System.out.println() in each constructor. 
 *  
 * b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. 
 * 
 * Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */

public class Computer {
	
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;
	
	public Computer() {
		System.out.println("This is from default Constructor of Computer class");	
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade,boolean madeInUSA) {
		
		this.Brand = brand;
		this.Model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("My Brand: "+ Brand +", Model: " + Model +", OperatingSystem: " +OperatingSystem+", Price: " +price+"$, and Made In USA?: "+madeInUSA);
				 	}
	
	
public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA,char grade) {
		
		this.Brand = brand;
		this.Model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("My Brand: "+ Brand +", Model: " + Model +", OperatingSystem: " +OperatingSystem+", Price: " +price+"$, and Made In USA?: "+madeInUSA+"Grade:"+grade);
}

public Computer(String brand) {
	
	this.Brand = brand;
	System.out.println("Brand: "+brand);
	
}
public Computer(String brand, String model, String operatingSystem)
{
	
	this.Brand = brand;
	this.Model = model;
	this.OperatingSystem = operatingSystem;
	
	System.out.println("My Brand: "+ Brand +", Model: " + Model +", OperatingSystem: " +OperatingSystem);

}

public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA) {
	
	this.Brand = brand;
	this.Model = model;
	this.OperatingSystem = operatingSystem;
	this.price = price;
	this.madeInUSA = madeInUSA;
	
	System.out.println("My Brand: "+ Brand +", Model: " + Model +", OperatingSystem: " +OperatingSystem+", Price: " +price+"$, and Made In USA?: "+madeInUSA);
			 	}


}
