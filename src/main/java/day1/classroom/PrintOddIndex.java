package day1.classroom;

public class PrintOddIndex {

	public static void main(String[] args) {
	String str = "changetouppercase";
	char[] change = str.toCharArray();
	for(int i = 0; i < change.length; i++) {
		
		if(i % 2 == 0) {
			System.out.print(Character.toUpperCase(change[i]));
		} else {
			System.out.print(change[i]);
		}
		
	}

	}

}
