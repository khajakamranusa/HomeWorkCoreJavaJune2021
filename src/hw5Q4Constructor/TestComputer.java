package hw5Q4Constructor;

/*
 * b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. 
 * 
 * Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */
public class TestComputer {

	public static void main(String[] args) {

		Computer computer = new Computer();
		Computer computer2 = new Computer("Apple", "MacBook Air","MacOS Mojave",800,'C',false);
		Computer computer3 = new Computer("Dell","Inspiron","i1500",600,false,'B');
		Computer computer4 = new Computer("Sony");
		Computer computer5 = new Computer("Lenovo","A091","Windos");
		Computer computer6 = new Computer("HP", "XYZ","A 789",900,false);
	}

}
