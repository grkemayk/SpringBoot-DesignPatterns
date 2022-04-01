package Lambda.Example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
interface Example
{
	void ExampleMethod(String str);
}
interface StringFunction 
{
	  String run(String str);
}

public class LambdaExamples {

	public static void main(String[] args) {
		
		Example xExample = (mesaj) ->
		{
			System.out.println(mesaj);
		};
		xExample.ExampleMethod("Example-Worked with Parameter!");
		
		Example xExampleCallBack = (mesaj) ->
		{
			vCallBack();
		};

		vMyMethod(xExampleCallBack);
		

		Runnable task = () -> {System.out.println("Runnable");}; 
		new Thread(task).start();
		
		vRegexExample();
	}
	public static void vMyMethod(Example xExample)
	{
		System.out.println("1");
		xExample.ExampleMethod("Deneme");
		System.out.println("2");
	}
	public static void vCallBack()
	{
		System.out.println("Call-Back Worked!");
	}
	public static void vRegexExample()
	{
		String str = "sayi1225465646";
		System.out.println(str.contains("sayi12"));
		Pattern eslesme = Pattern.compile(str);

		// şimdi eşleşmeyi kontrol etmesi için Matcher hazırladık
		Matcher kontrol = eslesme.matcher("sayi12");
		if (kontrol.matches()) {
		    System.out.println(true);
		}

		// ve eşleşme varsa veya yoksa sonuc olan boolean değişkenimizi döndürdük.
		kontrol = eslesme.matcher("say456");
		if (kontrol.matches()) {
		    System.out.println(true);
		}
	}

}
