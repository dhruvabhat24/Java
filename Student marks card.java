//Write a program to calculate the percentage of a given student in CBSE board exam. His marks from 5 subjects must be a as input from user
//marks are out of 100
import java.util.Scanner;
public class UserInput1 {

	public static void main(String[] args) {
		System.out.println("The Result of the Student");
		System.out.println("Marks are");
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		System.out.println("marks in sub 1:"+sub1);
		int sub2=sc.nextInt();
		System.out.println("marks in sub 2:"+sub2);
		int sub3= sc.nextInt();
		System.out.println("marks in sub 3:"+sub3);
		int sub4=sc.nextInt();
		System.out.println("marks in sub 4:"+sub4);
		int sub5=sc.nextInt();
		System.out.println("marks in sub 5:"+sub5);
		int  total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total marks is:"+total);
		System.out.println("####Marks Card###");
		System.out.println(sub1+"\n=sub 1\n"+sub2+"\n=sub 2\n"+sub3+"\n=sub 3\n"+sub4+"\n=sub 4\n"+sub5+"\n=sub 5\n");
		System.out.println("Total=\n"+total);
	}

}
