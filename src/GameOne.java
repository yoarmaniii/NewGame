import java.util.Scanner;

public class GameOne {
		
	public static void main(String[] args) {
		System.out.println("Welcome! Who do I have the pleasure of speaking to today?");
		Scanner user = new Scanner(System.in);
		String userName;
		String choice;
		userName = user.nextLine();
		System.out.println();
		
		System.out.println(userName + "," +" "+ "would you like to see your future?");	
		choice = user.nextLine();
		boolean userContinue = true;
		
			if(userContinue.equals("yes"))
			{	System.out.println("Cool! Lets begin your Sci-Fi journey to the future!");
				
			}
		
		
	}
}