package SpringBoot.annotations;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class annotationMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context
        = new AnnotationConfigApplicationContext(AutomativeConfiguration.class);
		
		context.scan("SpringBoot.annotations");//Yaratılmış componentlerin oldugu pacage ismini verirsek orayı tarayıp bunları bean olarak yaratır.

		Car xCarComponent = (Car)context.getBean("componentCar");
		System.out.println(xCarComponent.strCarName);
   		
		Car xCar = (Car) context.getBean("car");
		Automative xAutomative = (Automative )context.getBean("myautomative");

		//System.out.println(xCar.strCarName);
		System.out.println(xAutomative);
		
		//System.out.println(args.length); Parametre olarak verilen args JVM'in ilk olarak hangi methodu çalıştırması gerektiğini belirtir. Bu neden main method String[] args alır. Uzunluğu 0'dır.
		

	}

}
