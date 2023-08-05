package PsU.BridgeD;

public class Radio implements iDevice {
	
	private boolean ON = false;
	private int volume = 30;
	private int channel = 100;
	
	@Override
	public boolean isEnabled(){		
		return ON;		
	}
	
	@Override
	public void enable() {
		ON = true;
	}
	
	@Override
	public void disable() {
		ON =false;
	}
	
	@Override
	public int getVolume() {
		return volume;
	}
	
	@Override
	public void setVolume(int r ) {
		if( r >100) {
			this.volume=100;
		}else if( r<0){
			this.volume=0;
		}else {
			this.volume=r;
		}
	}
	
	@Override
	public int getChannel() {
		return channel;
	}
			
	
	@Override
	public void setChannel(int r ) {
		this.channel=r;
	}
	
	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
        System.out.println("| This is the Radio.");
        System.out.println("| I'm " + (ON ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
	}
}
