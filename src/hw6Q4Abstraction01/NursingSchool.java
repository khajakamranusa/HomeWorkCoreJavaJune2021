package hw6Q4Abstraction01;
/*
 * Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method.
  Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes 
 */

public abstract class NursingSchool {
	
	public void hygiene() {
	System.out.println("This is non Abstract Method implement");
	}
	
	public abstract void caring();//Abstract Method Declared
	
	public NursingSchool() {// Constructor created inside Abstract class
	
		//used for the inheritance of of Abstract Class one key word
		//Abstr
		
	}
	

}
