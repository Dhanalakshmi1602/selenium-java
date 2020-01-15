package day5and6.Assignments;

public class Bajaj extends Bike {
	
	@Override
	public void speed() {
		System.out.println("the speed of the bike is 100km/hr");
		
	}


	public static void main(String[] args) {
		Bajaj bajaj = new Bajaj();
		bajaj.cost();
		bajaj.speed();
		
		

	}



}
