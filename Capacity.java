
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		int m = read.nextInt();
    		
    		// Declare a new variable to store the 5 seater capacity
            int five_seat_capacity = n*5;
    		
    	    // Declare a new variable to store the 7 seater capacity
            int seven_seat_capacity = m*7;
            
            // Print the desired output for each test case
            System.out.println(five_seat_capacity+seven_seat_capacity);
		}
	}
}
