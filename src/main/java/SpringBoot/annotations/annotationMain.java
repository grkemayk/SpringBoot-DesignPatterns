package SpringBoot.annotations;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class annotationMain {

	public static void main(String[] args) {
		
		ApplicationContext xApplicationContext = new AnnotationConfigApplicationContext(AutomativeConfiguration.class);
		
		Car xCar = (Car) xApplicationContext.getBean("car");
		Automative xAutomative = (Automative )xApplicationContext.getBean("myautomative");

		//System.out.println(xCar.strCarName);
		System.out.println(xAutomative);
		
		//System.out.println(args.length); Parametre olarak verilen args JVM'in ilk olarak hangi methodu çalıştırması gerektiğini belirtir. Bu neden main method String[] args alır. Uzunluğu 0'dır.

	}

}
