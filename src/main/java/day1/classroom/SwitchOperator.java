package day1.classroom;

public class SwitchOperator {

	public static void main(String[] args) {
		int a = 10, b= 20;
		String s = "add";		
		switch (s) {
		case "add":
			
			System.out.println("Addition of 2 nos is :" + (a+b));
			break;
			
		case "Sub": 
					
			System.out.println("Subtraction of 2 nos is : " + (a-b));
			break;
			
		case "mul":
			System.out.println("Multiplication of 2 nos is : " +(a*b));
			break;
			
		case "div":
			System.out.println("Division of 2 nos is : " + (a/b));
			break;
			
		default :
			System.out.println("invalid input");
	}

}
}
