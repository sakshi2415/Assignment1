package assignment1;

public class SumOfBelowFiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=55;
		int sum=0;
		while(n>0) {
			int temp =n%10;
			sum = sum +temp;
			n= n/10;
			}
		
		System.out.println(sum);
	}

}
