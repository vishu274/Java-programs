class IfStatement{
	public static void main(String args[]){
		
		int a = 100; 
		int b = 200;
		int c = 300;
		if(a < b){
			if(a<c){
				System.out.println("A is less than b and c");
			}
			System.out.println("b is greater");
		}else if (a < c){
			System.out.println("A is less than c");
		}
		else{
			System.out.println("A is greater");
		}

	}
}