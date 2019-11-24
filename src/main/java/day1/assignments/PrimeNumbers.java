package day1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {

	int n = 113;
	boolean flag = true;
		for (int i=2; i< n/2 ; i++) {
			if(n%i == 0) {
		flag = false;
				break;
			}
		}	
		
		if(flag == true) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
				
		
		
		
	}

}
