/* Suppose you have a Piggie Bank with an initial amount of $50 and you have to addsome more amount to it. Create a class AddAmount with a data member named
amount with an initial value of $50. Now make two constructors of this class as
follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to the Piggie Bank
Create an object of the  AddAmount class and display the final amount in the Piggie Bank.*/
public class Addamount {
	double amount ;
	public Addamount() {
		this.amount=50;
		
	
	
		
	}
	public Addamount(double amount) {
		this.amount= 50 + amount;
	}
     public double getAmount() {
    	 return amount;
     }
     public static void main(String args[]) {
    	  Addamount obj = new Addamount();
    	  System.out.println("final amount in pigg bank : $"+obj.getAmount());
          Addamount obj1 = new Addamount(100);
          System.out.println("final amount in pigg bank : $"+obj1.getAmount());
     }    
}
