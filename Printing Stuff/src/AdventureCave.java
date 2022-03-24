//Created on August 19, 2016 at 10:04 AM
import java.util.Scanner;
import java.util.Random;
public class AdventureCave {

	public static void main(String[] args) {
		
		System.out.println("Welcome traveler, to the Cave of Wonders! Aventures await!");
		
		int playerLevel = 1;
		double playerHealth = 10.0;
		Scanner playerInput = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		System.out.println("What is you name adventurer?");
        String playerName = playerInput.nextLine();
        System.out.println("\nYou are adventurer " + playerName + " at level " + playerLevel + '.');
        
        System.out.println( "You are " + playerName + " the level " + playerLevel + " adventurer.");
        
         
         
        System.out.println("\nYou made it to the entrance of the cave.");
        playerLevel = playerLevel + 1;
        System.out.println("You leveled up. You are now level " + playerLevel);
         
         
        
        double rockDamage = randomGenerator.nextInt(5);
        System.out.println("\nA treacherous rock ambushes you.");
        playerHealth -= rockDamage;
        System.out.println("You took " + rockDamage
                + " damage. You have " + playerHealth
                + " health remaining.");
         
        if( playerHealth <= 0 ){ 
 
            System.out.println("Oh no, "
                 + playerName +" died! They were level "
                    + playerLevel);
            System.exit(0);
 
        }
         
        String playerAnswer;
        System.out.println("You are in a cave."
                + "\nThere is a dark path to the left."
                + "\nThere is a pile of rubble to the right."
                + "\nWould you like to go 'left' or 'right'?");
        
        playerAnswer = playerInput.nextLine();
         
        if(playerAnswer.equalsIgnoreCase("right")){
            System.out.println("You climb up the pile of rubble."
                    + " It leads to a small cavern."
                    + "\nThere is a treasure chest here."
                    + " It is full of treasure.");
        }
        else if(playerAnswer.equalsIgnoreCase("left")){
            System.out.println("The path gets very dark. Another cunning rock ambushes you.");
            rockDamage = 4.0;
            playerHealth -= rockDamage;
            System.out.println("You took " + rockDamage
                    + " damage. You have " + playerHealth
                    + " health remaining.");
             
            if( playerHealth <= 0 ){ 
 
                System.out.println("Oh no, "
                     + playerName +" died! They were level "
                        + playerLevel);
                System.exit(0);
 
            }
        }
         
        playerInput.close();
	}
}