package SpringBoot.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

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
