
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
        	int x = read.nextInt();
        	
        	// Create a new variable Y for total distance.
        	// 5 days a week - Chef will travel 2*X daily - i.e. return trip walk to office
        	int y = 2 * x * 5;
        	
        	// Print the distance travelled for each test case.
        	System.out.println(y);
		}
	}
}
