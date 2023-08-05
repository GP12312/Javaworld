package PsU.BridgeD;

public class AdvancedRemote extends BasicRemote{

	public AdvancedRemote(iDevice d1) {
			super.d=d1;		 
	}
	
	public void mute() {
		System.out.println("Muting the device");
		d.setVolume(0);
	}

}
