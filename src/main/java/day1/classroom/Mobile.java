package day1.classroom;

public class Mobile {
	
	public void makeCall(long num) {
		System.out.println("Calling to" + num);
	}
	
	public void sendSms(long num, String s) {
		System.out.println("sending message to" + num +" Message " + s);
	}
	
	public boolean close()
	{
		System.out.println("shut down the mobile");
		return true;
	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall( 988776655);
		mob.sendSms( 988776655,"Hello");
		boolean close = mob.close();
		System.out.println(close);
	}

}
