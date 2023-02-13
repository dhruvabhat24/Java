import java.util.Scanner;
public class Elseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
      int age=sc.nextInt();
      if(age>56) {
    	  System.out.println("You are Experienced");
      }
      else if(age>46) {
    	  System.out.println("You are semi-Experienced");
      }
      else if(age>36) {
    	  System.out.println("Begineer");
      }
      else {
    	  System.out.println("Not Experienced");
      }
	}

}
