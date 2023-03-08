
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        // 'next' reads a string
        int t = read.nextInt();
        
        for(int i=0; i<t; i++)
        {
            //without ';', you will get a compilation error
            int n = read.nextInt();
            System.out.println(n*2);
        }
	}
}
