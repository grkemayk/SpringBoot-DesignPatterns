package Lambda.CreateMethod;

interface IInterface {
	String vMethod();
}



public class LambdaWithoutParameter {

	public static void main(String[] args) {
		
		IInterface xIInterfaceNonParameter = () ->
		{
			return "Non-Parameter";
		};
		
		System.out.println(xIInterfaceNonParameter.vMethod());
		
	}

}
