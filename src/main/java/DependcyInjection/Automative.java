package DependcyInjection;

public class Automative implements AutomativeSkills{
	
	AutomativeSkills xAutomativeSkills;
	public Automative(AutomativeSkills xDependcyAutomativeSkills)
	{
		this.xAutomativeSkills = xDependcyAutomativeSkills;
	}
	@Override
	public void vRun() {
		xAutomativeSkills.vRun();
		
	}
	@Override
	public void vStop() {
		xAutomativeSkills.vStop();
		
	}

}
