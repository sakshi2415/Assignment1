package assignment1;

public class Pattern {
	public static void main(String[] args) {
		
		
		printStars(6);
	
	}
	
	 static void printStars(int n) {
		 
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j =1; j<=i; j++) {
			
				System.out.print("* ");
			}
			
			System.out.println();
		}
			
			

	
		
	}

}
