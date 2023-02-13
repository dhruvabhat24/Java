
public class StringMethods {

	public static void main(String[] args) {
		//strings are immutable
		// strings cannot be changed it can give a new string
		String name="Dhruva";
		int value =name.length();
		System.out.println(value);
		String lstring=name.toLowerCase();
		System.out.println(lstring);
		String ustring=name.toUpperCase();
		System.out.println(ustring);
		String nonTrimmedString="     Dhruva     ";
		System.out.println(nonTrimmedString);
		System.out.println(nonTrimmedString.trim());
		System.out.println(name.substring(1));
		System.out.println(name.substring(2, 5));// it will print the charecters between the ranges 
		System.out.println(name.charAt(3));// it will print the charecter of a specific index
		System.out.println(name.indexOf("u"));// it will tell the index position
		String modifiedname="Dhruvhruva";
		System.out.println(modifiedname.indexOf("ruv",4));// if there is no match then it will return -1 
		System.out.println(name.lastIndexOf("u"));
		System.out.println(modifiedname.lastIndexOf("ruv", 4));
		System.out.println(name.equals("Dhruva"));
		System.out.println(name.equals("dHruva"));
		System.out.println(name.equalsIgnoreCase("dHrUvA"));	
		System.out.println("I am escape sequence\" double quote");
		System.out.println("I am escape sequence\\ double quote");
	}

}
// string.length()-->it will tell the number of charecters
//string.tolowerCase--> Returns a new string which has all the lowercase fromm the string name 
// string.trim--> it will remove the extra spaces
// string.substring(value)--> the print function will print from that position
// Escape Sequence Charecters -----> \n,\t,\',\\
// \n-->new line
// \t--> tab
