/*Create an abstract class 'Parent' with a method 'message'.
 It has two subclasses each having a method with the same name 'message' that prints
 "This is first subclass" and "This is second subclass" respectively.
 Call the methods 'message' by creating an object for each subclass.*/
 abstract class Parent {
public abstract void  message();

}
class Child1 extends Parent{
	public void message() {
		System.out.println("This is first subclass");
		
	}
	
}
class Child2 extends Parent{
	public void message() {
		System.out.println("This is second subclass");
	}
	public static void main(String args[]) {
		Child2 obj = new Child2();
		obj.message();
		Child1 obj1 = new Child1();
		obj1.message();
	}
}