
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
    		int n = read.nextInt();
    		
    	
    		int points_per_testcase = x /10;
    		int score = points_per_testcase * n;
    		
    		System.out.println(score);
		}
	}
}
