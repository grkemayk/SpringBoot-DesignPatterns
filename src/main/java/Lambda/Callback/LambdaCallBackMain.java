package Lambda.Callback;

interface IInterfaceCallBack {
	void vMethod();
}
public class LambdaCallBackMain {

	
	static Controller xController = new Controller();
	static IInterfaceCallBack xIInterfaceCallBack=()->
	{
		xController.vCallBack();
	};
	
	public static void vMyMethod(IInterfaceCallBack xIInterfaceCallBack)
	{
		System.out.println("1");
		xIInterfaceCallBack.vMethod();
		System.out.println("2");
	}
	public static void main(String[] args) {
		vMyMethod(xIInterfaceCallBack);

	}

}
