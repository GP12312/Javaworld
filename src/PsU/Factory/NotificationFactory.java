package PsU.Factory;

public class NotificationFactory {
	
	public Notification createANotification(String channel ) {
		
		if(channel == null ) {
			return null;
		}
		switch(channel){
		case "SMS": 
					return new NotificationSMS();
		case "EMAIL":
					return new NotificationEMAIL();
		case "PUSH":
					return new NotificationPUSH();
		default:
            throw new IllegalArgumentException("Unknown channel "+channel);					
		}		
	}
}
