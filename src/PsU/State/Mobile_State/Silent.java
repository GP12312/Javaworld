package PsU.State.Mobile_State;

public class Silent implements MobileNotifyState {

	public Silent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notify(AlertStateContext ctx) {
		System.out.println(" silent mode ..." );
	}

}
