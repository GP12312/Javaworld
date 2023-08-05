package PsU.State.Mobile_State;

public class AlertStateContext {
	
	public MobileNotifyState currentState;

	public AlertStateContext() {
		currentState = new Vibration();		
	}
	
	public void setState (MobileNotifyState mns) {
		currentState = mns;			
	}
	
	public void alert() {
		currentState.notify(this);
	}

}
