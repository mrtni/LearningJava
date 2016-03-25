import java.util.Random;

public class NameGenerator {

	public static void main (String[] args){

		System.out.println("This is a simple name generator");

		Random random = new Random();
		String[] firstname = {"Sam", "Tom", "Agnes", "Julia"};
		String[] surname = {"Smith", "Chang", "Kowalski", "Schmitt"};
		System.out.println("The generated name is: " + firstname[random.nextInt(firstname.length)] + " " + surname[random.nextInt(surname.length)]);  
	}
}
