package day5.classroom;

public class TestingClass {

	public static void main(String[] args)
	{   
		
		PocoPhone rahulPhone = new PocoPhone();
		rahulPhone.takeAIPhoto();
		rahulPhone.takePocoPhoto();
		System.out.println("intro date of poco = " + rahulPhone.getIntroDate());
		
		
		MocoPhone dhanaPhone = new MocoPhone();
		dhanaPhone.takeAIPhoto();
		System.out.println("intro date of moco = " + dhanaPhone.getIntroDate());
		
		
		GalaxyS8 umaPhone = new GalaxyS8();
		System.out.println("intro date of galaxy = " + umaPhone.getIntroDate());
	}
}
