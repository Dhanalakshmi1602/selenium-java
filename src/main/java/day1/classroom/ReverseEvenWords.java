package day1.classroom;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String sentence = "I am a software tester";
		String[] words = sentence.split(" ");
		
		for(int i = 0; i< words.length; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(words[i]);	
			}
			else
			{
				printReverse(words[i]);
				
			}
			System.out.print(" ");
		}
	}

	public static void printReverse(String word) {
	char[] rev = word.toCharArray();
	for(int i = rev.length-1 ; i >=0; i--) {
		System.out.print(rev[i]);
	}
	
		
	}
	
	
}
