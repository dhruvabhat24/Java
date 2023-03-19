
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		// Always first check if the problem has test cases
		int t = read.nextInt();
		// loop through each test case for its inputs
		for(int i=0; i<t; i++)
		{
		    // Accept 2 integers inputs.
    		int a = read.nextInt();
    		int b = read.nextInt();
    		
    		// Each burger needs 1 patty and 1 bun. Hence the minimum of these 2 is the maximum number of burgers which can be made
    		int burgers = Math.min(a, b); 
    		
    		// print the desired output for each test case
    		System.out.println(burgers);
		}
	}
}
