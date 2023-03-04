
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        // accept the count of test cases given in the the 1st line
        int t = read.nextInt();
        
        // Run a loop to accept 't' inputs
        for(int i=0; i<t; i++)
        {
            // accept 5 integers in each test case
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();
            int e = read.nextInt();
            // output the 5 integers on a single line for each test case
            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        }
}
}
