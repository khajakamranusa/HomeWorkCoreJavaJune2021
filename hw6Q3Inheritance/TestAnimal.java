package hw6Q3Inheritance;
/*03) (Paste the complete question between package and class by multiple line comments.). Create a package name "hw6Q3Inheritance" in HW project. Inside the package,
 *  a) Create a class "Animal". Implement a method inside the class -- animalInfo and System.out.println("This method is from Animal Class").
 *   b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println("This method is from Mammal Class"). 
 *   c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println("This method is from Reptile Class").
 *    d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println("This method is from Birds Class").
 *     e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class"). 
 *     f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println("This method is from Snake Class").
 *      g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class").
 *       h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class").     
 *        i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class").


 * Now create a class "TestAnimal".
 *  Under the main method create an object from each class
 *  and call their own method by their own object. 
 *  Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal,
 *   Cobra -- snake--reptile--Animal,
 *    Robin -- Bird -- Animal etc.
 *    An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. Also, show by java comments who is Parent class and who is child class. Organize the code.
 *     Push the code in Github. Paste your github link below.
 */

public class TestAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal();// ** Object create from the Animal class**
		animal.animalInfo();// ** Method call from own object **

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();// Single Inheritance & Animals Parents & Mammal Child

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();// Single Inheritance & Animals Parents & Reptile Child

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();// Single Inheritance & Animals Parents & Birds Child

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();// Mammal Parents & Dog Child
		dog.animalInfo();// Hierarchical Inheritance Animal Parents & Mammal Child

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();// Reptile Parents & Snake Chaild
		snake.animalInfo();// Hierarchical Inheritance Animal Parents & Reptile Child

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();// Birds Parents & Robin Child
		robin.animalInfo(); // Hierarchical Inheritance Animal Parents & Birds Child

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();// Dog Parents & BullDog Child
		bullDog.dogInfo();// Mammal Parents & Dog Child
		bullDog.mammalInfo();// Multilevel Inheritance Animal Parents & Mammal Child

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();// Snake Parents &Cobra Child
		cobra.reptileInfo();// Reptile Parents & Snake Child
		cobra.animalInfo();// Multilevel Inheritance Animal Parents & Reptile Child

	}

}
