package SpringBoot.annotationExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringBoot.annotations.AutomativeConfiguration;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
        = new AnnotationConfigApplicationContext();
		context.scan("SpringBoot.annotationExample");
		context.refresh();//Eger configuration class'i context'a parametre olarak geçilmediyse scan işleminden sonra reflesh yapilmasi zorunludur.
		
		  KisiController kisicontroller= (KisiController) context.getBean("kisiController");
		  Kisi kisi= kisicontroller.kisiOlustur();
		  System.out.println("Ad: " + kisi.getAd());
		  System.out.println("Id: " + kisi.getId());
		
	}

}
