package PsU.State.Mobile_State;

public class Vibration implements MobileNotifyState {

	public Vibration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notify(AlertStateContext ctx) {
		System.out.println(" vibration..." );
 

	}

}
