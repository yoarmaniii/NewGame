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

			} 
			else {
				if(choice.equalsIgnoreCase("Yes"))
			 	System.out.println("Cool! Lets begin your Sci-Fi journey to the future!");
				
			
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
					System.out.println("No one has ever seen this creature before! What a discovery! He seems friendly!");
					System.out.println("What do you want to feed him? fish, veggies, a building");
					choice = user.nextLine();
					if(choice.equalsIgnoreCase("fish"));
					{ System.out.println("You give him the fish and He LOVES it!");
					  System.out.println("He approaches you and he wants you to stare in his __eyes");
					  System.out.println("what color eyes does he have? Green, Black, Yellow?");
					  choice = user.nextLine();
					  String green;
					  green = choice;
					  if(choice.equalsIgnoreCase("Green")){

					  System.out.println("He has green eyes, and they are soo beautiful!");
						  System.out.println("Last part of your future is that you give him a name. What's his name");
						  choice = user.nextLine();
						  System.out.println("You named him" + choice);
						  System.out.println(userName + "and" + choice);
						  System.out.println("They became great friends and went in search of their parents together!! THE END");
						  break;
					  }
					}
				}
			}
							String head2;
							head2 = choice;
							switch(head2){
							case "2":
								
								System.out.println("No one has ever seen this creature before with 2 heads! What a discovery! He seems friendly!");
								System.out.println("What do you want to feed him? fish, veggies, a building");
								choice = user.nextLine();
								if(choice.equalsIgnoreCase("veggies"));
								{ System.out.println("You give him the veggies and He HATES it!");
								  System.out.println("He approaches you and he wants you to stare into his __eyes");
								  System.out.println("what color eyes does he have? Green, Black, Yellow?");
								  choice = user.nextLine();
								  String Black;
								  Black = choice;
								  if(choice.equalsIgnoreCase("Black")){

								  System.out.println("He has black eyes, and they are soo beautiful!");
									  System.out.println("Last part of your future is that you give him a name. What's his name?");
									  choice = user.nextLine();
									  System.out.println("You named him" + " " + choice);
									  System.out.println(userName + " "  + "and" + " " + choice);
									  System.out.println("They became great friends and went in search of their parents together!! THE END");
									  break;
					  }
					  }
				}
							String head3;
							head3 = choice;
							switch(head3){
							case "3":
								
								System.out.println("No one has ever seen this creature before with 3 heads! Are you sure its one of Godzilla's children?? What a discovery! He seems friendly though!");
								System.out.println("What do you want to feed him? fish, veggies, a building");
								choice = user.nextLine();
								if(choice.equalsIgnoreCase("a building"));
								{ System.out.println("I dont think he can do that JUUUSSSTTT yet! Good try though!");
								  System.out.println("He approaches you and he wants you to stare into his __eyes");
								  System.out.println("what color eyes does he have? Green, Black, Yellow?");
								  choice = user.nextLine();
								  String Yellow;
								  Yellow = choice;
								  if(choice.equalsIgnoreCase("Yellow")){

								  System.out.println("He has yellow eyes, and they are soo beautiful!");
									  System.out.println("Last part of your future is that you give him a name. What's his name?");
									  choice = user.nextLine();
									  System.out.println("You named him" + " " + choice);
									  System.out.println(userName + " "  + "and" + " " + choice);
									  System.out.println("They became great friends and went in search of their parents together!! THE END");
									  break;
			}
								}
			}
										
					
					
									if(choice.equalsIgnoreCase("Run Away"))
									System.out.println("You have left the fantasy game! Thanks for playing" + userName);
					 }
			}
			}	


	
			
	

	
	
