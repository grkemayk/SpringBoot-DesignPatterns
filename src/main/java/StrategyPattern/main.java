package StrategyPattern;

public class main {

	public static void main(String[] args) {

		System.out.println("1");
		PhoneManager xPhoneManager = new PhoneManager();
		xPhoneManager.xPhoneProperty = new Samsung();
		
		System.out.println(xPhoneManager.xPhoneProperty.GetProperty());
	}

}
