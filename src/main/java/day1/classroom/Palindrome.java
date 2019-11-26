package day1.classroom;

public class Palindrome {

	public static void main(String[] args) {
		String[] names = {"madam", "malayalam", "rahul"};
		for(int i = 0; i<names.length ; i++) {
			char[] single = names[i].toCharArray();
			boolean flag = true;
			for (int j = 0 ; j <single.length/2 ; j++)
			{
				if(single[j] != single[single.length - (j + 1)])
				{  
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(names[i] + " is a palindome");
			}
			else {
				System.out.println(names[i] + " is not a palindome");
			}
		}
	}

}


