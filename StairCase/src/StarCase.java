//Created on August 19, 2016 at 10:04 AM
import java.util.Scanner;
public class StarCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of stairs you want:");
		int input = in.nextInt();
		
		for (int i = 0; i < input; i++){
			for (int j = input - 1 - i; j < input; j++){
				
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		for (int i = 0; i < input; i++){
			for (int j = i; j < input; j++){
				
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		for (int x = 0; x < input; x++){
			for (int z = x; z < input; z++){
				
				System.out.print(" ");
			}
			for (int a = input*2 - x - 1; a < input*2; a++){
				
				System.out.print("* ");
			}
		System.out.println();
		}
		System.out.println();
		for (int c = 0; c < input; c++){
			for (int b = input - 1 - c; b < input; b++){
				
				System.out.print(" ");
			}
			for (int a = c; a < input; a++){
				
				System.out.print("* ");
			}
		System.out.println();
		
		in.close();

	}

}
}