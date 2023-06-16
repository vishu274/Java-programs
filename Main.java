import java.util.Scanner;




class Parent{
	String name;
	public void getname() 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the name");
	name=s.next();
	}
	public void showname()
	{
		System.out.println("the name is"+name);
		
	}
	
}



class Student extends Parent{
	

int rollno;
public void  rollno() {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the roll no");
	rollno=s.nextInt();
}
public void showroll()
{
	System.out.println("the rollno is"+ rollno);
	
}
}
class Teacher extends Student{
	int regno;
	public void regno() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the regno");
		regno=s.nextInt();
		
	}
	public void showregno() {
		System.out.println("the regno is" +regno);
		
		
	}
	
}


public class Main {
	public static void main(String args[]) {
		Teacher s=new Teacher();
		s.rollno();
		s.showroll();
		s.getname();
		s.showname();
		s.regno();
		s.showregno();
		

}
}
