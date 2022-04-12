package PatternExample;

public class Phone implements PhoneCommonSkills{
	
	PhoneCommonSkills xPhoneCommonSkills;
	PhoneType xPhoneType;
	
	public Phone(PhoneCommonSkills xPhoneCommonSkills)
	{
		this.xPhoneCommonSkills = xPhoneCommonSkills;
	}

	@Override
	public void Ring() {
		xPhoneCommonSkills.Ring();		
	}

	@Override
	public void Battery() {
		xPhoneCommonSkills.Battery();		
	}

}
