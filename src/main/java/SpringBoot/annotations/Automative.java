package SpringBoot.annotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Automative {
	
	@Override
	public String toString() {
		return "Automative [xCar=" + xCar + ", strAutomativeName=" + strAutomativeName + "]";
	}
	
	@Autowired//car id'li Bean'i dependcy injection ile class'a enjecte etmis olduk.
	//@Resource(name="car") birden fazlda car tipine sahip bean varsa resource ile id vererek secim yapariz.
	public Car xCar;
	public String strAutomativeName;
}
