package SpringBoot.annotationExample2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringBoot.annotationExample2.Kisi;
import SpringBoot.annotationExample2.KisiController;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
        = new AnnotationConfigApplicationContext();
		context.scan("SpringBoot.annotationExample2");
		context.refresh();//Eger configuration class'i context'a parametre olarak geçilmediyse scan işleminden sonra reflesh yapilmasi zorunludur.
		
		KisiController xKisiController = (KisiController) context.getBean("KisiRestController");
		Kisi xKisi = xKisiController.YeniKisi("Gorkem", "Aykac");
		System.out.println(xKisi.toString());


	}

}
