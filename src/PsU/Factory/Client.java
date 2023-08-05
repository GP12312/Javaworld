package PsU.Factory;

public class Client {

	public static void main(String args[]) {
		
		NotificationFactory nft = new NotificationFactory();
		Notification not = nft.createANotification("PUSH");
		not.notifyUser();
		
		
	}

}
