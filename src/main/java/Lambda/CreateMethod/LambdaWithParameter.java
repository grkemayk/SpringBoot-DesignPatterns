package Lambda.CreateMethod;

interface IInterfaceParameter {
	String vMethod(String strName);
}
public class LambdaWithParameter {

	public static void main(String[] args) {
		
		IInterfaceParameter xIInterfaceParameter = (mesaj) ->
		{
			return (mesaj);
		};
		System.out.println(xIInterfaceParameter.vMethod("Parameters"));
		

	}

}
