package PatternExample;

public class Iphone  extends PhoneType implements PhoneCommonSkills{

	@Override
	public void Ring() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Battery() {
		System.out.println("Iphone Battery");
	}

	@Override
	public void PhoneCommonType() {
		System.out.println("PhoneType Iphone");		
	}

}
