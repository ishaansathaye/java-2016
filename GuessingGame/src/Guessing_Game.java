//Created August 19, 2016 at 10:04 AM
import java.util.Scanner;
import java.util.Random;
public class Guessing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Scanner nameInput = new Scanner(System.in);
		Scanner answerInput = new Scanner(System.in);
		Scanner playerInput = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = nameInput.nextLine();
		System.out.println("\nHello " + name + "!" + " Welcome to the Guessing Game");
		while (i == 5){
			boolean playing = true;
			Random generateNumber = new Random();
			int randomNumber = generateNumber.nextInt(6);
			while (playing == true){
				
				System.out.println("\nGuess a number from 0-5:");
				int guess = playerInput.nextInt();
				
				if (guess == randomNumber){
					
					System.out.println("\nCONGRATULATIONS, THAT IS CORRECT!");
					System.out.println("YOU WIN!");
					System.out.println("\nDo you want to play again?(Yes/No)");
					String answer = answerInput.nextLine();
					if (answer.equalsIgnoreCase("Yes")){
						
						playing = false;
						i = 5;
					}
					else if (answer.equalsIgnoreCase("No")){
						
						System.out .println("\nGame Over!");
						i = 4;
						playing = false;
					}
				}
				else {
					
					System.out.println("\nIncorrect.");
					System.out.println("Keep Trying.");
				}
				
			}
		}
		nameInput.close();
		playerInput.close();
	}

}
