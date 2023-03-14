
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		double a = read.nextInt();
    		double b = read.nextInt();
    		
    		// Division of A by B decimal result
    		double x = a/b;
    		System.out.println(x);
		}
	}
}
