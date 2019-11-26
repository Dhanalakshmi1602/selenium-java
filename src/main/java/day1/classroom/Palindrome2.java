package day1.classroom;

import java.util.Arrays;

public class Palindrome2 {

	public static void main(String[] args) {
		String[] name = {"madam", "malayalam","dhana"};
		for(int i = 0; i <name.length; i++) {
			
			char[] str = name[i].toCharArray();
			char[] rev = new char[str.length];
			
			for(int j=str.length-1; j>=0 ; j--) {
				rev[str.length -1 -j] = str[j];
			}
			
			String reversedString = new String(rev);
			
			if(name[i].equals(reversedString))
			{
				System.out.println(name[i] + " is a palin");
			}
			else
			{
				System.out.println(name[i] + " is not a palin");
			}
			
			
			/*if(Arrays.equals(str, rev))
			{
				System.out.println(name[i] + "is a palindrome ");
			} else {
				System.out.println(name[i] + "is not a palindrome ");	
			}*/
		
		}

	}

}
