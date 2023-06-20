/*We have to calculate the percentage of marks obtained in three subjects (each out of 100)
 by student A and in four subjects (each out of 100) by student B.
 Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student
 A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
 Create an object for each of the two classes and print the percentage of marks for both the students.*/
 abstract class Marks{
	 abstract double getPercentage();
		
	}
	class StudentA  extends Marks{
		
		    private double subject1;
		    private double subject2;
		    private double subject3;

		    public StudentA(double subject1, double subject2, double subject3) {
		        this.subject1 = subject1;
		        this.subject2 = subject2;
		        this.subject3 = subject3;
		    }
		    @Override
		    double getPercentage() {
		        double totalMarks = subject1 + subject2 + subject3;
		        return (totalMarks / 300) * 100; 
		    }
		}
		    class StudentB1 extends Marks{
		    	 private double subject1;
		    	 private double subject2;
		    	 private double subject3;
		    	 private double subject4;

		        public StudentB1(double subject1, double subject2, double subject3, double subject4) {
		            this.subject1 = subject1;
		            this.subject2 = subject2;
		            this.subject3 = subject3;
		            this.subject4 = subject4;
		        }
		        
				@Override
		        double getPercentage() {
		            double totalMarks = subject1 + subject2 + subject3 + subject4;
		            return (totalMarks / 400) * 100; 
		        }
		        public static void main(String args[]) {
		        	  StudentB1 studentB = new StudentB1(90,90,56,89);
		        	  double percentageB = studentB.getPercentage();
		        	  System.out.println("Percentage of Student B: " + percentageB);
		        	  StudentA studentA = new StudentA(87, 94, 82);
		        	  double percentageA = studentA.getPercentage();
		        	  System.out.println("Percentage of Student A: " + percentageA);
		        }}
		    
		    

		    

