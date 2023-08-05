package PsU.BridgeD;

public interface iDevice {
	
	boolean isEnabled();
	void enable();
	void disable();
	
	int getVolume();
	void setVolume(int r );
	
	int getChannel();
	void setChannel(int r );
	
	void printStatus();

}
