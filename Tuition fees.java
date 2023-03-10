
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept 2 integers inputs
        	int x = read.nextInt();
        	int y = read.nextInt();
        	
        	// Create a variable 'tuition' to store the tuition fees
        	int tuition = x *y;
        	
        	// Print the desired output for each test case
        	System.out.println(tuition);
		}
	}
}
