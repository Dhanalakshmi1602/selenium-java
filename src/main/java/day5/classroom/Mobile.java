package day5.classroom;

public abstract class Mobile {
	
	static final int DEFAULT_DEFINITION = 100;
	
	static final int DEFAULT_BEAUTIFY = 5;
	
	int batteryLevel = 80;
	
	String name = "Mobile";
	
	public void speaker()
	{
		System.out.println("All mobile has speaker facility");
	}
	
	public void touchScreen()
	{
		System.out.println("touchscreen characteristc");
	}

	public void takePhoto()
	{
		takePhoto(DEFAULT_DEFINITION, DEFAULT_BEAUTIFY);
	}
	
	public void takePhoto(int definition)
	{
		takePhoto(definition, DEFAULT_BEAUTIFY);
	}
	
	public void takePhoto(int definition, int beautify)
	{
		System.out.println("Taking photo with definition " + definition + " and beautify at " + beautify);
	}
	
	public abstract String getIntroDate();
	
}
