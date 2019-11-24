package day1.classroom;

public class SumOfDigits {

	public static void main(String[] args) {
		int a, sum = 0, input = 1234;
		while(input !=0)
		{
			a= input%10 ;
			input = input/10 ; 
			sum= sum+a;
			
		}
		System.out.println("sum of digits is " + sum);
	}

}
