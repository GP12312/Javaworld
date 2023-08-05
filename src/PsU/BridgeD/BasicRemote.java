package PsU.BridgeD;

public class BasicRemote implements iRemote {
	
	protected iDevice d;
	
	public BasicRemote() {};

	public BasicRemote(iDevice d1){		
		this.d=d1;
	}
	
	@Override
	public void power() {
		System.out.println(" Power function");
		if (d.isEnabled()) {
			d.disable();
		}else {
			d.enable();
		}					
	}
	
	@Override
	public void downVolume() {
		System.out.println("Reducing volume by 10 units " );
		d.setVolume(d.getVolume()-10);
		
		
	}
	
	@Override
	public void upVolume() {
		System.out.println("Increasing volume 10 units " );
		d.setVolume(d.getVolume()+10);

	}

	@Override
	public void downChannel() {
		System.out.println("Reducing Channel by 1 units");
		d.setChannel(d.getChannel()-1);
		
	}
	
	@Override
	public void upChannel() {
		System.out.println("Increasing Channel by 1 units");
		d.setChannel(d.getChannel()+1);
	}
	
	
}
