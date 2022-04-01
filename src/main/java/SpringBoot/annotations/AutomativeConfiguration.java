package SpringBoot.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomativeConfiguration {
	
	@Bean
	public Car car()
	{
		Car xCar = new Car();
		xCar.strCarName="Ford";
		return xCar;
	}
	@Bean("myautomative")
	public Automative automative()
	{
		Automative xAutomative = new Automative();
		xAutomative.strAutomativeName="Vasita";
		return xAutomative;
	}

	

}
