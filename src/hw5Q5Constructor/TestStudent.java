package hw5Q5Constructor;
/*
 * Create another class TestStudent. 
 * Create object as many as you want under the main method. 
 * Initialize constructors. 
 * I want the first outcome in the console as --> This is from default Constructor of Student class. 
 * The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true. 
 * Also, initialize the parameterized method. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */

public class TestStudent {
	

	public static void main(String[] args) {
		
		Student student = new Student();
				Student student1 = new Student("Kamran",014,'M',3.977f,true);
				Student student2 = new Student();
				student2.StName="Tausif";
				student2.stID=787;
				student2.gender='M';
				student2.grade=3.977f;
				
				student2.student("Tausif",787,'M', 3.977f);
				

	}
	

}
