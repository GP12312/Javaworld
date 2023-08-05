package PsU.State.Mobile_State;

public class Client {

	public static void main(String artgs[]) {
		AlertStateContext ct = new AlertStateContext();
		ct.alert();
		ct.alert();
		ct.setState(new Silent());
		ct.alert();
		ct.alert();
		ct.setState(new Vibration());
		ct.alert();
		
	}

}
