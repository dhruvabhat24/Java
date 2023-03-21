
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
    		int y = read.nextInt();
    		int z = read.nextInt();

    		int Total_Credits = 4*x + 2*y + 0*z;
    		
    		// Even spelling mistakes in variables matter!
    		System.out.println(Total_Credits);
		}
	}
}
