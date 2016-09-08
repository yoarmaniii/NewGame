import java.util.Scanner;

public class GameOne {

	public static void main(String[] args) {
		
		//Make a Scanner and declare variables
		Scanner userInput = new Scanner (System.in);
		String yourName;
		boolean faceTheBeast = true;
		boolean runAway = false;
		String choice = "yes";
		String choice2 = "no";
		
		
		//Ask questions
		
		System.out.println( " Welcome!! What is your name? ");
		yourName = userInput.nextLine();
		System.out.println();
		
		System.out.println("Would you like to play a game" + " " + yourName + "?");
		choice = userInput.nextLine();
		if (userInput.equals("yes")){
			
			System.out.println("Excellent!! You are walking across a vast field and you encounter Godzilla's child!!");
			System.out.println("What do you do" + " " + yourName);
		}
		
		

		
			
		}
		
		
		
	}


