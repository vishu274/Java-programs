import java.util.Scanner;
class login{
	String username;
	String password;
	int A;
	int B;
	int C;
	int D;

	Scanner  s =  new Scanner(System.in);
	public login() {
		
	
	
	System.out.println("Enter your username");

	username= s.next();
	System.out.println("Enter your password");
	password=s.next();
	
	if((username.equals("vaishali"))&& (password.equals("admin@123")))
	{
		System.out.println("Your password is correct");
		
	}	
	else
	{
		System.out.println("Your password is wrong");
	}
	}
	
	
	}

 
public class Main {
	
	public static void main(String args[]) {
		login obj=new login();
		
		
		
	
		
		
	}
}
