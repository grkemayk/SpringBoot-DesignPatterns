package PatternExample;

public class PhoneFactory {
	public static PhoneCommonSkills GetPhone(Class xClass) throws InstantiationException, IllegalAccessException
	{
		return (PhoneCommonSkills) xClass.newInstance();
	}

}
