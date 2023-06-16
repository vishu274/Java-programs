/* Create a class named Rectangle with two data members- length and breadth and a
function to calculate the area which is length*breadth. The class has threeconstructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that
number.
Now, create objects of the Rectangle class having none, one and two parameters
and print their areas.*/
class Rectangle1{
	int length;
	int breadth;
	public int calculateArea() {
		return length*breadth;
	}
	public Rectangle1() {
		this.length = 0;
		this.breadth=0;

}
	public Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle1(int value) {
		this.length = value;
		this.breadth = value;
		
	}
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			Rectangle1 obj = new Rectangle1();
			System.out.println("Area of rectangle: " + obj.calculateArea());
			System.out.print("Enter the value for rectangle: ");
	        int value = sc.nextInt();
	        
	        Rectangle1 obj1 = new Rectangle1(value);
	        System.out.println("Area of rectangle: " + obj1.calculateArea());
	        System.out.print("Enter the length for rectangle: ");
	        int length = sc.nextInt();
	        
	        System.out.print("Enter the breadth for rectangle: ");
	        int breadth = sc.nextInt();
	        Rectangle1 obj2 = new Rectangle1(length, breadth);
	        System.out.println("Area of rectangle: " + obj2.calculateArea());

		
		
		
}
}
	