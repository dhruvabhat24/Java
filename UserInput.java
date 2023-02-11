import java.util.Scanner;
//we have imported external code
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking input from the user");
		Scanner sc=new Scanner(System.in);
		// system.in means we are reading input from keyboard
		System.out.println("Enter the number 1:");
		int a=sc.nextInt();// taking input and storing
		System.out.println("Enter the number 2:");
		int b=sc.nextInt();// taking input and storing
		int sum=a+b;// performing the operation
		System.out.print("The sum is:");
		System.out.println(sum);
		String str1=sc.nextLine();
		System.out.println(str1);
		
	}

}
