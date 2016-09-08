import java.util.Scanner;

public class GameOne {
		
	public static void main(String[] args) {
		System.out.println("Welcome! Who do I have the pleasure of speaking to today?");
		Scanner user = new Scanner(System.in);
		String userName;
		String choice;
		userName = user.nextLine();
		boolean userContinue = true;
		System.out.println();
		
		System.out.println(userName + "," +" "+ "would you like to see your future? Yes/No?");	
		//Get user input for next line
		choice = user.nextLine();	
		//See what choice the user makes to start game
			if(choice.equalsIgnoreCase("No"))
			{	System.out.println( "We will see you when you are ready! Goodbye" +" " + userName + "!");

			} else {
				if(choice.equalsIgnoreCase("Yes"))
			 	System.out.println("Cool! Lets begin your Sci-Fi journey to the future!");
				}
			System.out.println();
			System.out.println("You are walking across a lovely desert field and you encounter one of Godzilla's children! He's hungry!! Uh OH!!");
			System.out.println("What do you do?" + "Face Him or Run Away?");
			choice = user.nextLine();
			
			if(choice.equalsIgnoreCase("Face Him"))
			{	System.out.println("You approach Godzilla's child! You see that he has __ heads");
				System.out.println("How many heads does he have? Choose 1, 2, or 3");
				choice = user.nextLine();
				
				String heads = choice;
				switch(heads) {
				case "1":
					System.out.println("ll");
					
				
				
				
				}
			
			}
			else {
				if(choice.equalsIgnoreCase("Run Away"))
					System.out.println("You have left the fantasy game! Thanks for playing" + userName);
			}
			}	
}
		
		
		
	
