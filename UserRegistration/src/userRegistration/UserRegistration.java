package userRegistration;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	String firstName;
	Scanner input=new Scanner(System.in);

	//Method for taking user Input
	public String getFirstName()
	{
		System.out.println("Please Enter your first Name");	
		System.out.println("Rules: ");
		System.out.println("First Name must start with Capital letter");
		System.out.println("Contain minimum 3 characters");
		String name=input.next();
		return name;
	}

	//Method for input checking
	public void userValidator()
	{
		this.firstName=getFirstName();
		Boolean validate=Pattern.matches("^[A-Z][a-z]{2,}", firstName);
		if(Boolean.TRUE.equals(validate))
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


