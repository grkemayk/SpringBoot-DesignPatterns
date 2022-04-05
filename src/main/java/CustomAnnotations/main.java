package CustomAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;



public class main {

	public static void main(String[] args) {
		vAnnatationExample();
		try {
			vGetAnnotation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@CustomAnnotation(value=10)  
	public static void vAnnatationExample()
	{
		System.out.println("Annotation2");
	}
	
	public static void vGetAnnotation() throws Exception
	{
		main xMain = new main();
		Method m = xMain.getClass().getMethod("vAnnatationExample");
		
		CustomAnnotation xCustomAnnotation = m.getAnnotation(CustomAnnotation.class);
		System.out.println(xCustomAnnotation.value());
		
}

}
