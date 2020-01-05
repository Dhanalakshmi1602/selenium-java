package day5and6.Assignments;

public class Desktop implements Hardware, Software
{

	@Override
	public void hardwareResources() {
		System.out.println("Hardware resources");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Software resources");
		
	}

	public void desktopModel() {
		System.out.println("The desktop model is asus");
	}

	public static void main(String[] args)
	{
		Desktop desktop = new Desktop();
		desktop.hardwareResources();
		desktop.softwareResources();
		desktop.desktopModel();
	}
}