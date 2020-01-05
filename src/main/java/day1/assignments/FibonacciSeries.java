package day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range  = 8;
		int firstnum =0;
		int secnum = 1;
		for(int i = 1; i <= range ; i++ ) {
			
		int sum = firstnum + secnum ;
		firstnum = secnum;
		secnum = sum;
		System.out.println(firstnum);
	}
	}

}
