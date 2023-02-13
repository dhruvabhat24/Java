//Write a program to calculate the percentage of a given student in CBSE board exam. His marks from 5 subjects must be a as input from user
//marks are out of 100
import java.util.Scanner;
public class UserInput1 {

	public static void main(String[] args) {
		System.out.println("The Result of the Student");
		System.out.println("Marks are");
		Scanner sc=new Scanner(System.in);
		float sub1=sc.nextInt();
		System.out.println("marks in sub 1:"+sub1);
		float sub2=sc.nextInt();
		System.out.println("marks in sub 2:"+sub2);
		float sub3= sc.nextInt();
		System.out.println("marks in sub 3:"+sub3);
		float sub4=sc.nextInt();
		System.out.println("marks in sub 4:"+sub4);
		float sub5=sc.nextInt();
		System.out.println("marks in sub 5:"+sub5);
		float  total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total marks is:"+total);
		float percentage=((sub1+sub2+sub3+sub4+sub5)/500)*100;
		System.out.println(percentage);
	}

}

