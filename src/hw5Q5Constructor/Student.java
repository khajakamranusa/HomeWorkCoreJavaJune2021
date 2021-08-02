package hw5Q5Constructor;

/*
 * 05) Create a package name "hw5Q5Constructor" in your HW project. Inside the package, a) Create a class "Student". 
 * Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). 
 * Declare default constructor and one parameterized constructors. 
 * Use only one System.out.println() in each constructor to declare the above variables. Also, create a parameterized method with all the variables. 
 * Create another class TestStudent. 
 * Create object as many as you want under the main method. 
 * Initialize constructors. 
 * I want the first outcome in the console as --> This is from default Constructor of Student class. 
 * The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true. 
 * Also, initialize the parameterized method. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */

public class Student {
	public String StName;
	public int stID;
	public char gender;
	public boolean programmer;
	public float grade;

	public Student() {//
		System.out.println("This is from default Constructor of Student class.");
	}

	public Student(String stName, int stID, char gender, float grade, boolean programmer) {

		StName = stName;
		this.stID = stID;
		this.gender = gender;
		this.grade = grade;
		this.programmer = programmer;

		System.out.println("Student Name: " + stName + "Student ID: " + stID + "Gender: " + gender + "Programmer: "
				+ programmer + "Ggrade: " + grade);
	}

	public void student(String stName, int stID, char gender, float grade) {
		System.out.println("Student Name: " + stName + "Student ID: " + stID + "Gender: " + gender +"Ggrade: " + grade);
	}

}
