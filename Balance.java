 //Repeat the addition in balance till 0 or negative value is entered
 import java.util.Scanner;
public class Balance {
	
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
int sum = 0;
while(true) {
	System.out.println("enter a number:");
	int number = sc.nextInt();
	
	if(number<=0) {
		break;
	}
	sum += number;
	
	

	System.out.println("sum:"+sum);
}
	
	System.out.println("finall sum:"+sum);
}
}