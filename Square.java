class Shape{
public void Shape(){
System.out.println(" different shapes");
}
}
class Rectangle extends Shape{
Rectangle(int a, int b ){
int length=a;
int breadth=b;

System.out.println("rectangle area="+ length*breadth);
}

}
class Square extends Rectangle{
Square(int a){
super(2,3);
		
System.out.println("area of square =" + a*a);
}
public static void main(String args[]){
Square obj = new Square(5);
}
}



