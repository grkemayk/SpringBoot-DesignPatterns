package PatternExample;

public class main {

	public static void main(String[] args) {
		try
		{
			Phone xPhone = new Phone(PhoneFactory.GetPhone(Iphone.class));//Dependcy Injection + Factory Pattern
			xPhone.Battery();
			
			xPhone.xPhoneType = new Iphone();
			xPhone.xPhoneType.PhoneCommonType();

		}
		catch(Exception e)
		{
			
		}
	}

}
