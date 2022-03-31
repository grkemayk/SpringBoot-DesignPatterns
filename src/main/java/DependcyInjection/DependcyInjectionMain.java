package DependcyInjection;

public class DependcyInjectionMain {

	public static void main(String[] args) {
		
		Automative xAutomativeCar = new Automative(new Car());
		xAutomativeCar.vRun();
		xAutomativeCar.vStop();
		
		
		Automative xAutomativeTruck = new Automative(new Truck());
		xAutomativeTruck.vRun();
		xAutomativeTruck.vStop();
	}

}
