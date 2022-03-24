//Created August 19, 2016 at 10:04 AM
public class TwoDArray {

	public static void main(String[] args) {
		String [][] array = {
				{ "-", "|", "-", "|", "-"},
			    { "-----"},
			    { "-", "|", "-", "|", "-"},
			    { "-----"},
			    { "-", "|", "-", "|", "-"}
			};
		
		
		for (int row = 0; row < array.length; row++){
			for(int col = 0; col < array[row].length; col++){
				System.out.print(array[row][col]);
	
			}
			System.out.println();
		}
	}
}
	
	