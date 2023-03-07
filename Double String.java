
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        // accept the count of test cases given in the the 1st line
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            String s = read.next();
            // create a variable X which stores the value of string S concatenated with itself
            String x = s + s;
            // output the variable X
            System.out.println(x);
        }
	}
}
