import java.text.ChoiceFormat;
import java.util.Scanner;

public class GameOne {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println( " Welcome!! What is your name? ");
		System.out.print( " Enter name here -> ");
		String name;
		String choice = "Yes";
		name = input.nextLine();
		System.out.println();
		
		System.out.println( "Would you like to play a game?");
		System.out.println("Type Yes or No");
		choice = input.nextLine();
		

		
		while (choice.equals("Yes")); {
			System.out.println( "Excellent! you are walking across a field and you encounter a fire breathing dragon!");
			System.out.println( "What would you do?");
			System.out.println( "Face the beast or Run away?");
		}
		
		
		
	}

}
