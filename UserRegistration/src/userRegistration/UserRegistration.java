package userRegistration;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	String firstName;
	String lastName;
	Scanner input=new Scanner(System.in);

	//Method for taking first name as input
	public String getFirstName()
	{
		System.out.println("Please Enter your first Name");	
		System.out.println("Rules: ");
		System.out.println("First letter should be Capital letter");
		System.out.println("Contain minimum 3 characters");
		String name=input.next();
		return name;
	}

	//Method for taking last name as input
	public String getLastName()
	{
		System.out.println("Please Enter your Last Name");	
		System.out.println("Rules: ");
		System.out.println("first letter should be Capital letter");
		System.out.println("Contain minimum 3 characters");
		String name=input.next();
		return name;
	}

	//Method for input checking
	public void userValidator()
	{
		this.firstName=getFirstName();
		Boolean fName=Pattern.matches("^[A-Z][a-z]{2,}", firstName);
		printingResult(fName);
		this.lastName=getLastName();
		Boolean lName=Pattern.matches("^[A-Z][a-z]{2,}", lastName);
		printingResult(lName);
	
	}

	public static void printingResult(boolean check)
	{
		if(Boolean.TRUE.equals(check))
		{
			System.out.println("VALID");
		}
		else
		{
			System.out.println("INVALID");
		}
	}


	public static void main(String[] args) {
		System.out.println("Welcome to the User Registration");
		UserRegistration userinput=new UserRegistration();
		userinput.userValidator();
	}
}


