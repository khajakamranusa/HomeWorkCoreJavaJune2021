package hw4Q3JavaVariablesConstructorAndMethod;

/*
 * (03) Create --- a package name "hw4Q3JavaVariablesConstructorAndMethod" in "HomeWorkCoreJavaJune2021" project. Create a Class name "MyProfile".
 * Declare 8 types (If less than 8 type, will get zero) of primitive variable and initialize them by object under main method. 
 * Declare default constructor and initialize it (show by comments where it is initializing). 
 * Use a method and add above declared variable to use to get a outcome in console. Print out 2 sets of data for different person (one is you, another one is your favorite person). Type as much as possible. Use \n, \t somewhere in the String. After finish writing the code, paste the code here.
 */

public class MyProfile {

	public String MyName;
	public int myAge;
	public char mySex;
	public boolean birthUSA;
	public byte serialNumber;
	public short idNumber;
	public long cellNumber;
	public float myGread;
	public double myHeight;

	public MyProfile() {// Declare default constructor
	}

	public void myProfile() {

		System.out.println("My Name: " + MyName + "My Age: " + myAge + "My Sex: " + mySex + "My Birth: " + birthUSA
				+ "My Serial Number: " + serialNumber + "My Id Number: " + idNumber + "My Cell Number: " + cellNumber
				+ "My Gread: " + cellNumber + "My Height: " + myHeight);

	}

	public static void main(String[] args) {
		MyProfile kamran = new MyProfile();
		kamran.MyName = "Khaja Mohammad Kamran";
		kamran.myAge = 40;
		kamran.mySex = 'M';
		kamran.birthUSA = true;
		kamran.serialNumber = 014;
		kamran.idNumber = 2000;
		kamran.cellNumber = 32134334l;
		kamran.myGread = 2.50f;
		kamran.myHeight = 5.8;

		kamran.myProfile();

		System.out.println("\n**********************\n");

		MyProfile Rafan = new MyProfile();
		Rafan.MyName = "Rafan Mohammad Kamran Khawaja";
		Rafan.myAge = 40;
		Rafan.mySex = 'M';
		Rafan.birthUSA = true;
		Rafan.serialNumber = 014;
		Rafan.idNumber = 2000;
		Rafan.cellNumber = 32134334l;
		Rafan.myGread = 2.50f;
		Rafan.myHeight = 5.8;

		Rafan.myProfile();

	}

}
