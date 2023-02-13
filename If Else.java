import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Yes boy you can drive");
		}
		else
		{
			System.out.println("No boy you cannot drive yet");
		}
	}

}
