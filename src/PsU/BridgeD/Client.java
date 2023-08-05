package PsU.BridgeD;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		testDevice(new TV());
		testDevice(new Radio());
		testRemote(new AdvancedRemote(new Radio()));
	}
	
	public static void testDevice(iDevice d2) {
		System.out.println("Tests with Basic Remote");
		BasicRemote br1 = new BasicRemote(d2);
		br1.power();
		d2.printStatus();
		br1.upVolume();
		d2.printStatus();
		
		System.out.println("Tests with Advacned Remote");
		BasicRemote br2 = new BasicRemote(d2);
		br2.power();
		d2.printStatus();
		
		
	}
	
	
	public static void testRemote(iRemote r) {
		System.out.println("Testing through remote");
		iDevice radio = new Radio();
		
		System.out.println("The Volume of the radio is :"+  radio.getVolume());
		
		
	}

}
