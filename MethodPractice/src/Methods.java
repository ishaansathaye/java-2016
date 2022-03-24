//Created on August 19, 2016 at 10:04 AM
//Unfinished!
import java.util.Arrays;
import java.util.Scanner;
public class Methods {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = in.nextInt();
		System.out.println("\nEnter another number:");
		int b = in.nextInt();
		largeNumber(a, b);
		
		try{
		Thread.sleep(2000);
		}
		catch(Exception e){}
		
		char z = '\n';
		int length = 100;
		char[] chars = new char[length];
		Arrays.fill(chars, z);
		System.out.print(String.valueOf(chars));

		System.out.println("Enter a number:");
		int c = in.nextInt();
		System.out.println("\nEnter another number:");
		int d = in.nextInt();
		smallNumber(c, d);
		
		try{
			Thread.sleep(2000);
			}
			catch(Exception e){}
	}
	public static int largeNumber(int a, int b){
		int larger_number = 0;
		if (a > b){
			System.out.println("\n" + a + " is greater than " + b);
			larger_number = a;
		
		}else if (b > a){
			System.out.println("\n" + b + " is greater than " + a);
			larger_number = b;
		}else if (b == a){
			System.out.println("The numbers are equal.");
		}
		return larger_number;
		
	}
	public static int smallNumber(int c, int d){
		int smaller_number = 0;
		if (c < d){
			System.out.println("\n" + c + " is smaller than " + d);
			smaller_number = c;
		
		}else if (d < c){
			System.out.println("\n" + d + " is smaller than " + c);
			smaller_number = d;
		}else if (d == c){
			System.out.println("The numbers are equal.");
		}
		return smaller_number;
	}
	public static int smallestNumber(int e, int f, int g){
		int smallest_number = 0;
		if ((e < f) && (e < g)){
			System.out.println("\n" + e + " is smaller than " + f + " and " + g);
			smallest_number = e;
		
		}else if ((f < e) && (f < g)){
			System.out.println("\n" + f + " is smaller than " + e + " and " + g);
			smallest_number = f;
			
		}else if ((g < f) && (g < e)){
			System.out.println("\n" + g + " is smaller than " + f + " and " + e);
			smallest_number = g;
		}
		return smallest_number; 
	}

}
