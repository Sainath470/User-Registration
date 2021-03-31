package userRegistration;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String passWord;
	Scanner input=new Scanner(System.in);

	//Method for taking first name as input
	public String getFirstName()
	{
		System.out.println("Enter your first Name");	
		System.out.println("Rules: ");
		System.out.println("First letter should be Capital letter");
		System.out.println("Contain minimum 3 characters");
		String name=input.next();
		return name;
	}

	//Method for taking last name as input
	public String getLastName()
	{
		System.out.println("Enter your Last Name");	
		System.out.println("Rules: ");
		System.out.println("first letter should be Capital letter");
		System.out.println("Contain minimum 3 characters");
		String name=input.next();
		return name;
	}

	public String getUserEmail()
	{
		System.out.println("Enter your valid Email");	
		String email=input.next();
		return email;
	}

	public String getUserPhoneNumber()
	{
		System.out.println("Enter your valid Phone Number ");	
		System.out.println("phone number must be in this format ex: 91 1234567890");
		String phoneNum=input.next();
		return phoneNum;
	}
	
	public String getPassword()
	{
		System.out.println("Enter the Password");	
		System.out.println("Rules: ");
		System.out.println("Minimum 8 characters");
		String pWord=input.next();
		return pWord;
	}

	//Method for input checking
	public void userValidator()
	{
		this.firstName=getFirstName();
		Boolean fName=Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
		printingResult(fName);
		this.lastName=getLastName();
		Boolean lName=Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
		printingResult(lName);
		this.email=getUserEmail();
		Boolean emailid=Pattern.matches("^[a-zA-Z.]+([a-z]+)?[@][a-z]+\\.[a-z]{2,3}(\\.[A-Za-z]{2,6})?", email);
		System.out.print("Your entered Email is "); 
		printingResult(emailid);
		this.phoneNumber=getUserPhoneNumber();
		Boolean pNumber=Pattern.matches("\\d{1,2}\\d{1,10}", phoneNumber);
		System.out.print("Your entered Phone number is ");
		printingResult(pNumber);
		this.passWord=getPassword();
		Boolean pass=Pattern.matches("[a-zA-Z]{8,}", passWord);
		System.out.print("Your entered PassWord is ");
		printingResult(pass);
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

	public static void main(String[] args)
	{
		System.out.println("Welcome to the User Registration");
		UserRegistration userinput=new UserRegistration();
		userinput.userValidator();
	}
}


