package indEncounters;

import java.util.Scanner;


public class indEncounter1 
{

	public static void displayindEncounter1() 
	{
		Scanner input = new Scanner(System.in);
		int userChoice;
		System.out.println("The day started out like any other normal day for Katie. She woke up, got ready for the day, and got on with her errands."
				+ "It didn't help that she had the suspicion she was being watched, or followed. She should've trusted her gut instinct, becuase one secon she was in the grocery store, next in a van."
				+ "\nKidnapped, and fearing for her life, she panicked. But her panicking was helpless, as it made nothing of difference. She soon calmed down and fell asleep, her own panic draining her of energy."
				+ "\nWhen she woke up, she wasa in an interrogation room, surrounded by what appeared to be people in various costumes. "
				+ "\nPlague doctors, witches, zombies, even werewolves. All things people fear, but it just confused Katie. "
				+ "\nUntil of course, from out of the darkness, a bag of shredded mozzarella cheese flew out and landed onto the table. Katie's heart dropped, and she instantly began pleading for the cheese to be removed.");
		System.out.println("What is someone to do in this situation?"
				+ "\n1- Attempt to slip out of bounds"
				+ "\n2- Kick the table and make the cheese fall");
		userChoice = input.nextInt();
		System.out.println("The struggling and the constant friction resulted in an escape from the bounds, and Katie was able to remove the bag of cheese from the table."
				+ "\nAfter removing the bag, she looked around, trying to find a way out. The one light in the room went out, and then red."
				+ "\nThe compound had lost power. "
				+ "\nIn the red flashing, Katie fonud a door, and this door led out to the hallway. She could hear people shouting, and yelling to 'contain the prisoners'. She probably shouldn't but she couldn't help but want to go towards the voices. "
				+ "\nWhat should she do?"
				+ "\n1- Go towards the voices, maybe they'll help."
				+ "\n2- Turn around and go away from the voices, they don't sound too friendly.");
		userChoice = input.nextInt();
		
		if(userChoice == 1) 
		{
			System.out.println("I'm no rocket scientist, but I'm pretty sure when someone says 'detain the prisoner', they don't have friendly intent. "
					+ "\nKatie is dragged away by the people and never heard from again."
					+ "\nGAME OVER");
		}
		else if(userChoice == 2) 
		{
			System.out.println("Yea, probably a better choice for later. Katie begins walking the halls of the compound, hearing various people talking about  "
					+ "these prisoners and how they must be contained. She passes a room with an open door, but when a light turns on she stops and looks at it, wondering if she should enter."
					+ "\n1- Maybe there's something useful in there, I've gotta check."
					+ "\n2- Better to stay away from possible traps, dodge the room.");
			userChoice = input.nextInt();
			if(userChoice == 1) 
			{
				System.out.println("You enter the room, and see some guards attire. After putting it on to hide from any roaming security, Katie notices the bag of cheese from earlier."
						+ "\nTerrified, her heart sinks. She's afraid of the fact that the attire she's wearing is tainted by the cheese."
						+ "\n1- Take it off, she could hyperventilate or something!"
						+ "\n2- Deal with it, gotta get through somehow without drawing attention.");				
				userChoice = input.nextInt();
			}
			else if(userChoice == 2) 
			{
				System.out.println("Ok, no chances taken today Katie. She begins walking away from the room when she hears some other security talking."
						+ "\n'The one that fears cheese is out, we'll start planting some around the compound. Maybe she'll scream if she touches it, hehe.'"
						+ "");
			}
			
		}

		

	}

}
