package hw6Q4Abstraction01;

/*
 * e) Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method .
 */
public abstract class EngineeringSchool {
	
	public void mechanicalLab() {
		System.out.println("This Method is non abstract");
	}
	public abstract void computerLab();// abstract Method
	
	public EngineeringSchool() {// Constructor created inside Abstract class
		
	}

}
