
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
        	int a = read.nextInt();
        	int b = read.nextInt();
        	
        	// Sum of inputs
        	int s = a + b;
        	
        	// Product of inputs
        	int p = a * b;
        	
        	// Print the desired output for each test case
        	System.out.println(s + " " + p);
		}
	}
}
