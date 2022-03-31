package SpringBoot.annotations;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class annotationMain {

	public static void main(String[] args) {
		
		ApplicationContext xApplicationContext = new AnnotationConfigApplicationContext(AutomativeConfiguration.class);
		
		Car xCar = xApplicationContext.getBean(Car.class);
		Automative xAutomative = xApplicationContext.getBean(Automative.class);

		//System.out.println(xCar.strCarName);
		System.out.println(xAutomative);

	}

}
