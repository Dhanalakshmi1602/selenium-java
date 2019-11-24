package day1.assignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		int remainder;
		int input = 153;
		int original = input;
		int calculated = 0;
			while(input !=0) {
				remainder = input % 10;
				input = input/10;
				calculated = calculated+(remainder*remainder*remainder);
			}
			
			if(calculated == original) {
				System.out.println(original + " is an amstrong number");
			}
			else {
				System.out.println(original + " is not an amstrong number");
			}
		
	}

}
