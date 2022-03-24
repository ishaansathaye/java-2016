//Created August 19, 2016 at 6:25 PM
import java.util.Scanner;
import static java.lang.System.out;
public class Sample {
	//Start grid at 1 (for user) using + for each time array is called
	//Entering something other than X or O will cause the program to stop after the grid is shown (try/catch or if/else) 
	public static boolean cor = false;
	public static char player_2_symbol = ' ';
	public static char player_1_symbol= ' ';
	public static String player_1_name = " ";
	public static String player_2_name = " ";
	public static int turn = 0;
	public static void main(String[] args) {

		//Introduction to game
		Scanner name = new Scanner(System.in);
		out.println("Do you want game instructons?(Yes or No)");
		String answer = name.nextLine();
		if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")){
			out.println("\n1. This is multiplayer so you will choose(X/O)");
			try{
				Thread.sleep(3000);}catch(Exception e){}
			out.println("2. ' ' means empty.");
			try{
				Thread.sleep(3000);}catch(Exception e){}
			out.println("3. To place your symbol:Enter the row then column Ex. 1 2");
			try{
				Thread.sleep(3000);}catch(Exception e){}
			out.println("4. 'O' always goes first.");
			try{
				Thread.sleep(3000);}catch(Exception e){}
			out.println("5. All the other rules of Tic-Tac-Toe are the same.");
			try{
				Thread.sleep(5000);}catch(Exception e){}
		}

		//Data from players
		out.println("\nEnter your name Player 1:");
		player_1_name = name.nextLine();
		do {
		out.println("Do you want to be X/O?");
		player_1_symbol = name.nextLine().toUpperCase().charAt(0);
		if (player_1_symbol != 'X' && player_1_symbol != 'O'){
			out.println("\nNot a valid symbol");
		}
		}
		while (player_1_symbol != 'X' && player_1_symbol != 'O');
		out.println("\nEnter you name Player 2");
		player_2_name = name.nextLine();
		if (player_1_symbol == 'X'){
			player_2_symbol = 'O';
		} else if (player_1_symbol == 'O'){
			player_2_symbol = 'X';
		}

		//Printing the game board
		char [][] array = new char [3][3];
		for (int row = 0; row < array.length; row++){
			for(int col = 0; col < array[row].length; col++){
				array[row][col] = ' ';
			}
		}
		out.println("\n");
		printBoard(array);

		//Player 1 goes first
		if (player_1_symbol == 'O'){
			while (turn <= 9){
				if ((turn == 0) || (turn == 2) || (turn == 4) || (turn == 6) || (turn == 8)){
					int r = 0;
					int c = 0;
					do{
						try {
							out.println("\n" + player_1_name + " enter the row then column sperated by a space:");
							r = name.nextInt()-1;
							c = name.nextInt()-1;
							cor = true;
							if (array[r][c] != ' '){
								out.println("\nChoose another spot.");
							}
						} catch(Exception e){
							out.println("\nChoose another spot.");
							
						}
					}
					while ((r > 2 || c > 2) || array[r][c] != ' ');

					array [r][c] = player_1_symbol;
					out.println("\n");
					printBoard(array);
					checkForWin(array);
				}
				if ((turn == 1) || (turn == 3) || (turn == 5) || (turn == 7) || (turn == 9)){
					int r = 0;
					int c =0;
					do{
						try {
							out.println("\n" + player_1_name + " enter the row then column sperated by a space:");
							r = name.nextInt()-1;
							c = name.nextInt()-1;
							cor = true;
							if (array[r][c] != ' '){
								out.println("\nChoose another spot.");
							}
						} catch(Exception e){
							out.println("\nChoose another spot.");
							
						}
					}
					while ((r > 2 || c > 2) || array[r][c] != ' ');
					
					array [r][c] = player_2_symbol;
					out.println("\n");
					printBoard(array);
					checkForWin(array);
				}
				turn++;
			}

		}

		//PLayer 2 goes first
		if (player_1_symbol == 'X'){
			while (turn <= 9){
				if ((turn == 0) || (turn == 2) || (turn == 4) || (turn == 6) || (turn == 8)){
					int r = 0;
					int c = 0;
					do{
						try {
							out.println("\n" + player_1_name + " enter the row then column sperated by a space:");
							r = name.nextInt()-1;
							c = name.nextInt()-1;
							cor = true;
							if (array[r][c] != ' '){
								out.println("\nChoose another spot.");
							}
						} catch(Exception e){
							out.println("\nChoose another spot.");
							
						}
					}
					while ((r > 2 || c > 2) || array[r][c] != ' ');

					array [r][c] = player_2_symbol;
					out.println("\n");
					printBoard(array);
					checkForWin(array);
				}
				if ((turn == 1) || (turn == 3) || (turn == 5) || (turn == 7) || (turn == 9)){
					int r = 0;
					int c =0;
					do{
						try {
							out.println("\n" + player_1_name + " enter the row then column sperated by a space:");
							r = name.nextInt()-1;
							c = name.nextInt()-1;
							cor = true;
							if (array[r][c] != ' '){
								out.println("\nChoose another spot.");
							}
						} catch(Exception e){
							out.println("\nChoose another spot.");
							
						}
					}
					while ((r > 2 || c > 2) || array[r][c] != ' ');
					
					array [r][c] = player_1_symbol;
					out.println("\n");
					printBoard(array);
					checkForWin(array);
				}
				turn++;
			}

		}
		name.close();
	}







	//METHODS
	public static void printBoard(char[][] a){
		out.println(" 1 2 3");
		for (int row = 0; row < a.length; row++){
			out.print(row+1);
			for(int col = 0; col < a[row].length; col++){
				System.out.print(a[row][col]);
				if(col < 2){
					System.out.print("|");
				}
			}
			if (row <2){
				System.out.println("\n -----");
			}
		}
	}

	public static void checkForWin(char[][] array){
		//Check for horizontal win for both players
		if (((array[0][0] == player_1_symbol) && (array[0][1] == player_1_symbol) && (array[0][2] == player_1_symbol)) ||
				((array[1][0] == player_1_symbol) && (array[1][1] == player_1_symbol) && (array[1][2] == player_1_symbol)) ||
				((array[2][0] == player_1_symbol) && (array[2][1] == player_1_symbol) && (array[2][2] == player_1_symbol))) {
			out.println("\n" + player_1_name.toUpperCase() + " YOU WIN!");
			System.exit(0);
		}
		else if (((array[0][0] == player_2_symbol) && (array[0][1] == player_2_symbol) && (array[0][2] == player_2_symbol)) ||
				((array[1][0] == player_2_symbol) && (array[1][1] == player_2_symbol) && (array[1][2] == player_2_symbol)) ||
				((array[2][0] == player_2_symbol) && (array[2][1] == player_2_symbol) && (array[2][2] == player_2_symbol))) {
			out.println("\n" + player_2_name.toUpperCase() + " YOU WIN!");
			System.exit(0);
		}

		//Check for vertical win for both players
		else if (((array[0][0] == player_1_symbol) && (array[1][0] == player_1_symbol) && (array[2][0] == player_1_symbol)) ||
				((array[0][1] == player_1_symbol) && (array[1][1] == player_1_symbol) && (array[2][1] == player_1_symbol)) ||
				((array[0][2] == player_1_symbol) && (array[1][2] == player_1_symbol) && (array[2][2] == player_1_symbol))) {
			out.println("\n" + player_1_name.toUpperCase() + " YOU WIN!");
			System.exit(0);
		}
		else if (((array[0][0] == player_2_symbol) && (array[1][0] == player_2_symbol) && (array[2][0] == player_2_symbol)) ||
				((array[0][1] == player_2_symbol) && (array[1][1] == player_2_symbol) && (array[2][1] == player_2_symbol)) ||
				((array[0][2] == player_2_symbol) && (array[1][2] == player_2_symbol) && (array[2][2] == player_2_symbol))) {
			out.println("\n" + player_2_name.toUpperCase() + " YOU WIN!");
			System.exit(0);
		}

		//Check for diagonal win for both players
		else if (((array[0][0] == player_1_symbol) && (array[1][1] == player_1_symbol) && (array[2][2] == player_1_symbol)) ||
				((array[2][0] == player_1_symbol) && (array[1][1] == player_1_symbol) && (array[0][2] == player_1_symbol))) {
			out.println("\n" + player_1_name.toUpperCase() + " YOU WIN!");
			System.exit(0);
		}
		else if (((array[0][0] == player_2_symbol) && (array[1][1] == player_2_symbol) && (array[2][2] == player_2_symbol)) ||
				((array[2][0] == player_2_symbol) && (array[1][1] == player_2_symbol) && (array[0][2] == player_2_symbol))) {
			out.println("\n" + player_2_name.toUpperCase() + " YOU WIN!");
			System.exit(0);
		}
		else if (turn == 8){
			out.println("\nIT'S A DRAW!");
			System.exit(0);
		}

	}

}